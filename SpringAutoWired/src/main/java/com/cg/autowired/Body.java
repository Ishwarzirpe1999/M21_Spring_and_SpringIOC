package com.cg.autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body 
{
	public static void main(String[] args) 
	{
		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
		Human human = a.getBean("human", Human.class);
		human.display();
	}

}