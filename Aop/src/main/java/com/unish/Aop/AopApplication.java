package com.unish.Aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AopApplication {


	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AopApplication.class, args);
		PaymentServiceImpl paymentObject = ctx.getBean(PaymentServiceImpl.class);
		paymentObject.makePayment();
	}

}
