package com.zk.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[]args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Helloworld obj1=(Helloworld) context.getBean("helloworld");
		obj1.getMessage1();
		obj1.getMessage2();
		HelloIndia obj2=(HelloIndia) context.getBean("helloIndia");
		obj2.getMessage1();
		obj2.getMessage2();
		obj2.getMessage3();
	}
}
