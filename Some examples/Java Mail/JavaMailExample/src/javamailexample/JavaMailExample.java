package javamailexample;

import com.sun.mail.imap.IMAPBodyPart;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

class MailAut extends Authenticator {

    PasswordAuthentication authentication;

    public PasswordAuthentication getPasswordAuthentication() {
        authentication = new PasswordAuthentication("infosocialspm@gmail.com", "socialspm123");
        return authentication;
    }
}

public class JavaMailExample {

    public static void main(String[] args) throws Exception {


        Properties props = new Properties();
        InputStream inputStream = new FileInputStream(new File("data.properties"));
        props.load(inputStream);

        //props.getProperty(null)

//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");

        Session session = Session.getDefaultInstance(props, new MailAut());

        String[] mails = {"zarvis.a@gmail.com","shashank.bhvajjula@gmail.com"};
        
        
        
        InternetAddress[] toAddress = new InternetAddress[mails.length];
        InternetAddress fromAddress = new InternetAddress("infosocialspm@gmail.com");

        for(int i = 0; i < toAddress.length; i++) {
        
        InternetAddress address = new InternetAddress(mails[i]);
        toAddress[i] = address;
        
        Message message = new MimeMessage(session);
        message.setRecipient(Message.RecipientType.TO, toAddress[i]);
        message.setFrom(fromAddress);
        message.setSentDate(new java.util.Date());
        message.setSubject("Hello From ASN");


        BodyPart messageBodyPart = new MimeBodyPart();

        // Fill the message
        messageBodyPart.setText("This is message body");

        // Create a multipar message
        Multipart multipart = new MimeMultipart();

        // Set text message part
        multipart.addBodyPart(messageBodyPart);

        // Part two is attachment
        messageBodyPart = new MimeBodyPart();
        String filename = "E:/Koala.jpg";
        DataSource source = new FileDataSource(filename);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(filename);
        multipart.addBodyPart(messageBodyPart);

        // Send the complete message parts
        message.setContent(multipart);

        // Send message
        Transport.send(message);
        }






    }
}
