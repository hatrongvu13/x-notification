package com.htv.notification.schedule;

import com.htv.notification.services.telegram.TelegramService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class InternetProtocolSchedule {

    private TelegramService telegramService;

    @Scheduled(cron = "0 0 * * * *")
    public void execInternetProtocol(){}
}
