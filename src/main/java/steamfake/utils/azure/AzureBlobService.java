package steamfake.utils.azure;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;

public class AzureBlobService {
    // Created by QuocBao

    public static BlobContainerClient getContainerClient(String containerName) {
        return AzureBlobConnector.getClient().getBlobContainerClient(containerName);
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

    public static long getBlobSize(BlobClient client) {
        return client.exists() ? client.getProperties().getBlobSize() : -1;
    }

    /**
     * Tải xuống file từ trên trời xuống và lưu vào máy (dùng cho cơ bản thôi, tải game không dùng)
     * @param destination đường dẫn lưu file + /tên file.[extension]
     * @param name tên file trên cloud
     * @param container tên container chứa file
     * @return true nếu tải thành công
     */
    public static boolean download(String destination, String name, String container) {
        BlobClient client = getContainerClient(container).getBlobClient(name);
        if(client.exists()) {
            client.downloadToFile(destination);
            return true;
        }
        return false;
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
}
