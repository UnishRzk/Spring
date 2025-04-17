package com.unish.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(FirstApplication.class, args);

		MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
		System.out.println(myFirstService.saySomething());
		System.out.println(myFirstService.getJavaVersion());
		System.out.println(myFirstService.getOsname());
		System.out.println(myFirstService.readProperty());
	}

}
