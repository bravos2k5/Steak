package utils.azure;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.specialized.BlobInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class AzureBlobService {
    // Created by QuocBao

    private static BlobContainerClient getContainerClient(String containerName) {
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

    /**
     * Dung lượng của file (dùng để lấy size và tính toán tiến trình tải xuống)
     * @param name tên file trên đám mây
     * @param container tên container chứa file
     * @return dung lượng của file
     */
    public static long getBlobSize(String name, String container) {
        BlobClient client = getContainerClient(container).getBlobClient(name);
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

    public static void main(String[] args) throws IOException {
        final long totalBytes = getBlobSize("test.png","images");
        BlobClient blobClient = getContainerClient("images").getBlobClient("test.png");
        try (BlobInputStream blobInputStream = blobClient.openInputStream()) {
            try(FileOutputStream fos = new FileOutputStream("./data/test.png")) {
                byte[] buffer = new byte[8192];
                int bytesRead;
                long totalBytesRead = 0;
                while ((bytesRead = blobInputStream.read(buffer)) != -1) {
                    fos.write(buffer,0,bytesRead);
                    totalBytesRead += bytesRead;
                }
            }
        }

    }
}
