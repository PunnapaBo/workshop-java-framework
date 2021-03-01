package com.example.kbtg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KbtgApplication {

	public static void main(String[] args) {
		//IoC Container
		ConfigurableApplicationContext context = SpringApplication.run(KbtgApplication.class, args);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
		System.out.println(context.getBeanDefinitionCount());

		User user1 = context.getBean(User.class);
		user1.setName("AAA");

		User user2 = context.getBean(User.class);
		user2.setName("BBB");

		System.out.println(user1.getName());
		System.out.println(user2.getName());
	}

}
