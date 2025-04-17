package com.unish.NotificationService;

public class EmailNotification implements Notifications{

    @Override
    public void sendNotification() {
        System.out.println("Sending email Notification");
    }
}
