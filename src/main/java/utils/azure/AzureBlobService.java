package utils.azure;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;

public class AzureBlobService {

    private static BlobContainerClient getContainerClient(String containerName) {
        return AzureBlobConnector.getClient().getBlobContainerClient(containerName);
    }

    public static void upload(String localPath, String name, String container) {
        BlobContainerClient blobContainerClient = getContainerClient(container);
        blobContainerClient.createIfNotExists();
        BlobClient client = blobContainerClient.getBlobClient(name);
        client.uploadFromFile(localPath,true);
    }

    public static long getBlobSize(String name, String container) {
        BlobClient client = getContainerClient(container).getBlobClient(name);
        return client.exists() ? client.getProperties().getBlobSize() : -1;
    }

    public synchronized static boolean download(String destination, String name, String container) {
        BlobClient client = getContainerClient(container).getBlobClient(name);
        if(client.exists()) {
            client.downloadToFile(destination);
            return true;
        }
        return false;
    }

    public synchronized static boolean delete(String name, String container) {
        BlobClient client = getContainerClient(container).getBlobClient(name);
        return client.deleteIfExists();
    }

}
