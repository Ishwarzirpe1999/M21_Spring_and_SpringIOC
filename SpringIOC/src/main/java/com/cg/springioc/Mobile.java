package com.cg.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args)
	{
		//Agenda-Spring IOC
		//1.We should not touch the source code.
		//2.this Application should be configurable.
		// hard-coding
		//for Vi class methods
		/*Vi v = new Vi();
		v.calling();
		v.data();
		
		//for Jio class methods
		Jio j= new Jio();
		j.calling();
		j.data();*/
		
		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config loaded...");
		//for vi class
		Vi v =(Vi)a.getBean("vi");
		v.calling();
		v.data();
	
		
	}

}
