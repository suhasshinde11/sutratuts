package com.practice.javamail;

import com.sun.mail.smtp.SMTPTransport;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

public class SendEmailAttachment {

    // for example, smtp.mailgun.org
    private static final String SMTP_SERVER = "smtp.gmail.com";
    private static final String USERNAME = "suhastest99@gmail.com";
    private static final String PASSWORD = "suhas@test";

    private static final String EMAIL_FROM = "suhastest99@gmail.com";
    private static final String EMAIL_TO = "shinde.suhas21@yahoo.com, shinde.suhas21@gmail.com";
    private static final String EMAIL_TO_CC = "";

    private static final String EMAIL_SUBJECT = "Test Send Email via SMTP";
    private static final String EMAIL_TEXT = "Hello Java Mail \n ABC123";


    public static void main(String[] args) {

        Properties prop = System.getProperties();
        prop.put("mail.smtp.auth", "true");

        Session session = Session.getInstance(prop, null);
        Message msg = new MimeMessage(session);

        try {

            msg.setFrom(new InternetAddress(EMAIL_FROM));

            msg.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(EMAIL_TO, false));

            msg.setSubject(EMAIL_SUBJECT);

            // text
            MimeBodyPart p1 = new MimeBodyPart();
            p1.setText(EMAIL_TEXT);

            // file
            MimeBodyPart p2 = new MimeBodyPart();
            FileDataSource fds = new FileDataSource("path/example.txt");
            p2.setDataHandler(new DataHandler(fds));
            p2.setFileName(fds.getName());

            Multipart mp = new MimeMultipart();
            mp.addBodyPart(p1);
            mp.addBodyPart(p2);

            msg.setContent(mp);


            SMTPTransport t = (SMTPTransport) session.getTransport("smtp");

            // connect
            t.connect(SMTP_SERVER, USERNAME, PASSWORD);

            // send
            t.sendMessage(msg, msg.getAllRecipients());

            System.out.println("Response: " + t.getLastServerResponse());

            t.close();

        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }

}
