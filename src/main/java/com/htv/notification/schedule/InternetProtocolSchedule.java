package com.htv.notification.schedule;

import com.htv.notification.services.telegram.TelegramService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InternetProtocolSchedule {

    private final TelegramService telegramService;

    @Scheduled(cron = "0 0 * * * *")
    public void execInternetProtocol(){
        try {
            telegramService.sendInternetProtocol();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
