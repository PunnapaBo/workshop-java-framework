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
	}

}
