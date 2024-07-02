package utils.azure;

import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.common.StorageSharedKeyCredential;

import java.time.Duration;

public class AzureBlobConnector {

    private static final String acName = "bravosrepo";
    private static final String acKey = "A3EsMcR/Hxhh5EIVWRf05jI0BjbvSZMblx+ZYFtZ9T+V7xKV/7G2pkwdu1RCRhNsLZCT2FPqA57z+AStu2UaGg==";
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
