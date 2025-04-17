package com.unish.NotificationService;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sms")
public class SmsNotification implements Notifications {

    @Override
    public void sendNotification() {
        System.out.println("Sending SMS Notification");
    }
}
