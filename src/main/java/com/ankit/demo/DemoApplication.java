package com.ankit.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext apc =  SpringApplication.run(DemoApplication.class, args);

		for(String str: apc.getBeanDefinitionNames()){
			System.out.println(str);
		}
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return args -> {
			System.out.println("Hello Ankit");
		};
	}

}
