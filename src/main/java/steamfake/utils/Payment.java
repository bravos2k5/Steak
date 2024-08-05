package steamfake.utils;

import com.fasterxml.jackson.core.type.TypeReference;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Payment {

    private final static String LOOK_UP = "https://api.vietqr.io/v2/lookup";
    private final static String QR = "https://api.vietqr.io/v2/generate";

    private static Payment instance;

    public static Payment gI() {
        if (instance == null) {
            instance = new Payment();
        }
        return instance;
    }

    private Payment() {
    }

    public BufferedImage getPaymentQR(String paymentContent, int paymentAmount) {
        try {
            String httpString = requestHTTP(createRequestQRJson(paymentContent, paymentAmount),QR);
            Map<String,Object> response = XJson.fromJson(httpString, new TypeReference<>() {});
            String qrDataURL = ((Map<?, ?>) (response.get("data"))).get("qrDataURL").toString();
            String base64 = qrDataURL.split(",")[1];
            byte[] decodedString = Base64.getDecoder().decode(base64);
            return ImageIO.read(new ByteArrayInputStream(decodedString));
        } catch (IOException e) {
            XMessage.alert(null,e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public String getNameOfBankAccount(String accountNo, String binCode) {
        try {
            String httpString = requestHTTP(createRequestCheckAccount(accountNo, binCode),LOOK_UP);
            Map<String,Object> response = XJson.fromJson(httpString, new TypeReference<>() {});
            if(!response.get("code").toString().contains("00")) {
                return null;
            }
            return ((Map<?, ?>) (response.get("data"))).get("accountName").toString();
        } catch (Exception e) {
            XMessage.alert(null,e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private String createRequestQRJson(String paymentContent, int paymentAmount) {
        Map<String,String> json = new HashMap<>();
        String accountNo = "0704795312";
        String accountName = "NGUYEN QUOC BAO";
        String acqId = "970422";
        String amount = paymentAmount + "";
        String template = "7ACoNZz";
        json.put("accountNo", accountNo);
        json.put("accountName", accountName);
        json.put("acqId", acqId);
        json.put("addInfo", paymentContent);
        json.put("amount", amount);
        json.put("template", template);
        return XJson.toJson(json);
    }

    private String createRequestCheckAccount(String accountNo,String binCode) {
        Map<String,String> json = new HashMap<>();
        json.put("bin", binCode);
        json.put("accountNumber", accountNo);
        return XJson.toJson(json);
    }

    private String requestHTTP(String request, String type) {
        try {
            HttpURLConnection conn = connectHTTP(type);
            posHTTP(request, conn);
            return readHTTP(conn);
        } catch (Exception e) {
            XMessage.alert(null,e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private String readHTTP(HttpURLConnection conn) {
        try {
            InputStreamReader isr = new InputStreamReader(conn.getInputStream());
            return new BufferedReader(isr).lines().collect(Collectors.joining());
        } catch (IOException e) {
            XMessage.alert(null,e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private void posHTTP(String json, HttpURLConnection conn) {
        try {
            OutputStream os = conn.getOutputStream();
            os.write(json.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            XMessage.alert(null,e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private HttpURLConnection connectHTTP(String type) {
        try {
            URL urls = URI.create(type).toURL();
            HttpURLConnection conn = (HttpURLConnection) urls.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("x-client-id", "e5f92bbc-1ee4-4a64-9ad2-0354a0c8974a");
            conn.setRequestProperty("x-api-key", "b33239fd-4867-442a-bfc9-e0df54ec7e1c");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);
            return conn;
        } catch (Exception e) {
            XMessage.alert(null,e.getMessage());
            throw new RuntimeException(e);
        }
    }

}