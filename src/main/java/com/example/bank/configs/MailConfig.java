package com.example.bank.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MailConfig {

    @Bean
    public JavaMailSender getMailConfig() {
        JavaMailSenderImpl sender = new JavaMailSenderImpl();

        Properties props = sender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

        sender.setHost("localhost");
        sender.setPort(25);
        sender.setUsername("no-reply@somecompany.com");
        sender.setPassword("password123");

        return sender;
    }
}
