package com.cg.autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human 
{
	private Heart heart;
	//default constructor
	public Human()
	{
		this.heart = heart;
	}
	
	//DI using constructor
	public Human(Heart heart)
	{
		super();
		this.heart = heart;
	}
	
	//DI using setters
	@Autowired
	@Qualifier("humanHeart")
	public void setH(Heart heart) {
		this.heart = heart;
	}

	public void display()
	{
		heart.pump();
	}
}