package com.htv.notification.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/email")
@RequiredArgsConstructor
public class EmailController {

    private final JavaMailSender mailSender;

    @PostMapping()
    public void send() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("vuht7@msb.com.vn");
        message.setSubject("HTV test email");
        message.setText("Demo email");
        mailSender.send(message);
    }
}
