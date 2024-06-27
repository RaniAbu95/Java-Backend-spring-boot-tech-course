package org.solarflare.myFirstDBProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyFirstDbProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MyFirstDbProjectApplication.class, args);
		System.out.println("Hello world");
		SystemManager manager = context.getBean(SystemManager.class);
		manager.run();
	}

}
