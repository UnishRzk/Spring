package com.unish.NotificationService;


public class SmsNotification implements Notifications {

    @Override
    public void sendNotification() {
        System.out.println("Sending SMS Notification");
    }
}
