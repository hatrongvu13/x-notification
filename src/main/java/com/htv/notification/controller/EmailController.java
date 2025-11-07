package com.htv.notification.controller;

import com.htv.notification.data.request.email.EmailRequest;
import com.htv.notification.data.response.email.EmailResponse;
import com.htv.notification.services.email.EmailService;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/email")
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @PostMapping()
    public EmailResponse sendEmailCV(@RequestBody EmailRequest emailRequest) {
        try {
            return emailService.sendEmailCV(emailRequest);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}
