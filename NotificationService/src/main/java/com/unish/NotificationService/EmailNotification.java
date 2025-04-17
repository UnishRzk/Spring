package com.unish.NotificationService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("email")
public class EmailNotification implements Notifications{

    @Override
    public void sendNotification() {
        System.out.println("Sending email Notification");
    }
}
