package com.htv.notification.data.request.telegram;

import lombok.Data;

import java.io.File;

@Data
public class TelegramRequest {
    String chatId;
    String messageId;
    String text;
    String type;
    File attachment;
}
