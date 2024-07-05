package steamfake.utils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class XEmail {

    private static final String email = "zenith@quocbao2k5.id.vn";
    private static final String password = "16122005viP@";
    private static final String host = "mail.quocbao2k5.id.vn";
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

    /**
     * Gửi email đến người nào đó
     * @param to địa chỉ mail người nhận
     * @param subject tiêu đề
     * @param text nội dung chính
     */
    public static void sendEmail(String to, String subject, String text) {
        Session session = Session.getInstance(props,authenticator);
        MimeMessage msg = new MimeMessage(session);
        try {
            msg.addHeader("Content-type","text/HTML; charset=UTF-8");
            msg.setFrom(email);
            msg.setSubject(subject);
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            msg.setSentDate(new Date());
            msg.setText(text,"UTF-8");
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
}
