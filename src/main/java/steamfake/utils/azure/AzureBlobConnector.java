package utils.azure;

import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.common.StorageSharedKeyCredential;

import java.time.Duration;

public class AzureBlobConnector {

    private static final String acName = "bravosrepo2";
    private static final String acKey = "krW4iedw8IjiYHMDRX7WwsdhrAjQlgY9YRBK+z6TMOzFFF2IUPjealQVaUg7orDaAMcMepkAT+Ab+AStgav+9A==";
    private static final String endPoint = String.format("https://%s.blob.core.windows.net/",acName);
    private static final StorageSharedKeyCredential sharedKeyCredential = new StorageSharedKeyCredential(acName,acKey);
    private static final BlobServiceClient blobServiceClient = buildClient();

    private static BlobServiceClient buildClient() {
        BlobServiceClientBuilder builder = new BlobServiceClientBuilder()
                .endpoint(endPoint)
                .credential(sharedKeyCredential);
        builder.httpClient(new NettyAsyncHttpClientBuilder()
                .connectTimeout(Duration.ofSeconds(8))
                .build());
        return builder.buildClient();
    }

    public static BlobServiceClient getClient() {
        return blobServiceClient;
    }

}
