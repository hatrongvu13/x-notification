package com.htv.notification.services.email;

import jakarta.mail.MessagingException;

import java.io.File;
import java.util.List;
import java.util.Map;

public interface EmailService {

    void send(String template, List<String> tos, List<String> ccs, String subject, Map<String, Object> data, File file) throws MessagingException;
}
