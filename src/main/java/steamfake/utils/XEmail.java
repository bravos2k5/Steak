package steamfake.utils;

import steamfake.model.Account;
import steamfake.model.Game;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class XEmail {

    private static final String email = "zenith@quocbao2k5.id.vn";
    private static final String password = "16122005viP@";
    private static final String host = "163.44.207.67";
    private static final String port = "587";
    private static final Properties props = getProps();
    private static final Authenticator authenticator = new Authenticator() {
        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(email,password);
        }
    };

    private static Properties getProps() {
        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port",port);
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.auth","true");
        return props;
    }

    public static void sendEmail(String to, String subject, String text) {
        Session session = Session.getInstance(props,authenticator);
        MimeMessage msg = new MimeMessage(session);
        try {
            msg.addHeader("Content-type","text/HTML; charset=UTF-8");
            msg.setFrom(email);
            msg.setSubject(subject);
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            msg.setSentDate(new Date());
            msg.setContent(text,"text/html; charset=UTF-8");
            Transport.send(msg);
            System.out.println("Sent");
        } catch (MessagingException e) {
            if (e instanceof SendFailedException &&
                    e.getMessage().contains("550 5.1.1")) {
                System.err.println("Email address does not exist.");
            } else {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void sendInvoice(String to,double moneyBeforePurchase,Game game) {
        String subject = "Hóa đơn thanh toán mua game";
        String text = "<h1>Hóa đơn</h1>" +
                "<p>Xin chào quý khách,</p>" +
                "<p>Bạn vừa mua game: <b>" + game.getName() + "</b> với số tiền là <b>$" + game.getGiaTien() + "</b>.</p>" +
                "<p>Số tiền trước khi thanh toán: <b>$" + moneyBeforePurchase + "</b></p>" +
                "<p>Số tiền còn lại sau thanh toán: <b>$" + (moneyBeforePurchase - game.getGiaTien()) + "</b></p>" +
                "<p>Cảm ơn đã sử dụng dịch vụ của chúng tôi.</p>";
        sendEmail(to,subject,text);
    }

    public static void sendInvoice2(Account account, double moneyBeforePurchase, Game game) {
        String subject = "Hóa đơn thanh toán mua game";
        String text = "    <h1>Hóa đơn</h1>\n" +
                "    \n" +
                "    <h2>Thông tin công ty</h2>\n" +
                "    <p>\n" +
                "        <strong>Tên công ty:</strong> Bravos, Inc<br>\n" +
                "        <strong>Địa chỉ:</strong> 2 Hacker Way<br>\n" +
                "        <strong>Email:</strong> zenith@quocbao2k5.id.vn<br>\n" +
                "        <strong>Phone:</strong> (84) 704-795-312\n" +
                "    </p>\n" +
                "    \n" +
                "    <h2>Thông tin khách hàng</h2>\n" +
                "    <p>\n" +
                "        <strong>Tên khách hàng:</strong>" + account.getHoTen() + "<br>\n" +
                "        <strong>Email:</strong>" + account.getEmail() + "<br>\n" +
                "        <strong>Phone:</strong>" + account.getPhone() + "\n" +
                "    </p>\n" +
                "    \n" +
                "    \n" +
                "    <h2>Chi tiết hóa đơn</h2>\n" +
                "    <table border=\"1\" cellpadding=\"5\" cellspacing=\"0\">\n" +
                "        <thead>\n" +
                "            <tr>\n" +
                "                <th>Mặt hàng</th>\n" +
                "                <th>Số tiền</th>\n" +
                "            </tr>\n" +
                "        </thead>\n" +
                "        <tbody>\n" +
                "            <tr>\n" +
                "                <td>" + game.getName() + "</td>\n" +
                "                <td>" + game.getGiaTien() + "</td>\n" +
                "            </tr>\n" +
                "        </tbody>\n" +
                "    </table>\n" +
                "    <p>Cảm ơn đã mua hàng</p>\n" +
                "\n";
        sendEmail(account.getEmail(), subject, text);
    }

}
