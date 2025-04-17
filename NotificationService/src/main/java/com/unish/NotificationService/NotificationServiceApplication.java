package com.unish.NotificationService;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NotificationServiceApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(NotificationServiceApplication.class, args);

		UserController user1 = ctx.getBean(UserController.class);
		user1.notifyUser();
		user1.notifyUserEmail();
		user1.notifyUserSms();
	}

}
