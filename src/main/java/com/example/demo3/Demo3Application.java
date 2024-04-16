package com.example.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo3Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo3Application.class, args);

		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");

		//Passing A object
		A temp=(A)context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
	}

}
