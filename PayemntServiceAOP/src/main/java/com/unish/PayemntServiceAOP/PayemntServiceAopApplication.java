package com.unish.PayemntServiceAOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class PayemntServiceAopApplication {

	public static void main(String[] args) {

	ApplicationContext ctx = SpringApplication.run(PayemntServiceAopApplication.class, args);

	PaymentServiceImpl paymentObject = ctx.getBean(PaymentServiceImpl.class);
	paymentObject.makePayemnt();

	}

}
