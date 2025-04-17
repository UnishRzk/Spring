package com.unish.playground;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PlaygroundApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =SpringApplication.run(PlaygroundApplication.class, args);

		Dev dev = ctx.getBean(Dev.class);

		dev.build();



	}

}
