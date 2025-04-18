package com.unish.NotificationService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @Qualifier("email")
    public EmailNotification eNotification(){
        return new EmailNotification();
    }

    @Bean
    @Qualifier("sms")
    public SmsNotification sNotification(){
        return new SmsNotification();
    }

}
