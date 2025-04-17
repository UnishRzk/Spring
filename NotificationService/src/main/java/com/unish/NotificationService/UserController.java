package com.unish.NotificationService;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserController {

    private final Notifications eNotify;
    private final Notifications sNotify;

    public UserController(
            @Qualifier("email") Notifications eNotifier,
            @Qualifier("sms") Notifications sNotifier
    ){
        this.eNotify = eNotifier;
        this.sNotify = sNotifier;
    }

    public void notifyUserEmail(){
        eNotify.sendNotification();
    }

    public void notifyUserSms(){
        sNotify.sendNotification();
    }


    public void notifyUser() {
        System.out.println("User has been notified");
    }
}
