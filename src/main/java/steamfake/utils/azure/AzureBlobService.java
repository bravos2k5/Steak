package steamfake.utils.azure;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;

import java.io.File;
import java.util.List;

public class AzureBlobService {

    public static BlobContainerClient getContainerClient(String containerName) {
        return AzureBlobConnector.gI().getClient().getBlobContainerClient(containerName);
    }

    /**
     * Up load dữ liệu lên kho lưu trữ đám mây
     * @param localPath đưòng dẫn file ở máy tính
     * @param name tên file muốn đẩy lên cloud
     * @param container tên container chứa file
     */
    public synchronized static void upload(String localPath, String name, String container) {
        BlobContainerClient blobContainerClient = getContainerClient(container);
        blobContainerClient.createIfNotExists();
        BlobClient client = blobContainerClient.getBlobClient(name);
        client.uploadFromFile(localPath,true);
    }


    /**
     * Tải xuống file từ trên trời xuống và lưu vào máy (dùng cho cơ bản thôi, tải game không dùng)
     *
     * @param destination đường dẫn lưu file + /tên file.[extension]
     * @param name        tên file trên cloud
     * @param container   tên container chứa file
     */
    public synchronized static void download(String destination, String name, String container) {
        BlobClient client = getContainerClient(container).getBlobClient(name);
        if(client.exists()) {
            new File(destination).getParentFile().mkdirs();
            client.downloadToFile(destination,true);
        }
    }

    /**
     * Xóa 1 file trên cloud
     * @param name tên file
     * @param container tên container
     * @return true nếu tồn tại và đã xóa nó
     */
    public synchronized static boolean delete(String name, String container) {
        BlobClient client = getContainerClient(container).getBlobClient(name);
        return client.deleteIfExists();
    }

    public synchronized static void deleteManyFile(String startWiths, String container) {
        BlobContainerClient blobContainerClient = getContainerClient(container);
        blobContainerClient.listBlobs().forEach(blobItem -> {
            if(blobItem.getName().startsWith(startWiths)) {
                delete(blobItem.getName(),container);
            }
        });
    }

    /**
     * Xóa nhiều file trên cloud
     * @param destinationFolder thư mục chứa các file cần download
     * @param startWith tieenf tố của tên file trên cloud
     * @param container tên container
     */
    public synchronized static void downloadManyFile(String destinationFolder, String startWith, String container) {
        new File(destinationFolder).mkdirs();
        BlobContainerClient blobContainerClient = getContainerClient(container);
        blobContainerClient.listBlobs().forEach(blobItem -> {
            if(blobItem.getName().startsWith(startWith)) {
                download(destinationFolder + blobItem.getName().replaceAll(startWith,"/"),blobItem.getName(),container);
            }
        });
    }

    public synchronized static void downloadManyFileExcept(String destinationFolder, String startWith, String container, List<String> except) {
        new File(destinationFolder).mkdirs();
        BlobContainerClient blobContainerClient = getContainerClient(container);
        blobContainerClient.listBlobs().forEach(blobItem -> {
            if(blobItem.getName().startsWith(startWith) && !except.contains(blobItem.getName())) {
                download(destinationFolder + blobItem.getName().replaceAll(startWith,"/"),blobItem.getName(),container);
            }
        });
    }

    public synchronized static void downloadManyFileIfNotExist(String destinationFolder, String startWith, String container) {
        new File(destinationFolder).mkdirs();
        BlobContainerClient blobContainerClient = getContainerClient(container);
        blobContainerClient.listBlobs().forEach(blobItem -> {
            if(blobItem.getName().startsWith(startWith)) {
                File file = new File(destinationFolder + blobItem.getName().replaceAll(startWith,"/"));
                if(!file.exists()) {
                    download(destinationFolder + blobItem.getName().replaceAll(startWith,"/"),blobItem.getName(),container);
                }
            }
        });
    }

    public synchronized static void downloadManyFile(List<String> azurePaths, String destination, String container) {
        new File(destination).mkdirs();
        for (String path : azurePaths) {
            BlobContainerClient blobContainerClient = getContainerClient(container);
            blobContainerClient.listBlobs().forEach(blobItem -> {
                BlobClient blobClient = blobContainerClient.getBlobClient(blobItem.getName());
                if(blobClient.exists()) {
                    blobClient.downloadToFile(destination + "/" + new File(path).getName(),true);
                }
            });
        }
    }

    /**
     * Đẩy nhiều file lên cloud
     * @param folderPath thư mục chứa các file cần đẩy lên
     * @param prefix tiền tố của tên file trên cloud
     * @param container tên container
     */
    public synchronized static void uploadManyFile(String folderPath, String prefix, String container) {
        BlobContainerClient blobContainerClient = getContainerClient(container);
        blobContainerClient.createIfNotExists();
        File[] files = new File(folderPath).listFiles();
        for (File file : files) {
            upload(file.getAbsolutePath(),prefix + "/" + file.getName(),container);
        }
    }

}
