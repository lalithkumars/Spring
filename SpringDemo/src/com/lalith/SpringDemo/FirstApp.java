package com.lalith.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstApp {

	public static void main(String[] args) {
		 ApplicationContext context =  new ClassPathXmlApplicationContext("spring-demo.xml");
		 Greeting greet = (Greeting) context.getBean("greeting");
		 greet.greet();
	}

}
