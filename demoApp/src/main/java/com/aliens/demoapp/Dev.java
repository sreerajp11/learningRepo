package com.aliens.demoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component      //Used for dependency injection. spring managed bean(object that is managed by the Spring IoC container)
public class Dev {  
	
//	@Autowired
//	private Laptop lap;   //field injection. @Autowired is used to connect the Laptop class to this class

//	public Dev(Laptop laptop)
//	{
//		this.lap = laptop;   //constructor injection . No need of @Autowired. (it is Optional)
//	}
	
	@Autowired
	private Computer computer;
	
//	@Autowired
//	public void setLaptop(Laptop laptop)   //setter injection. @Autowired is required
//	{
//		this.lap = laptop;
//	}
//	
	public void build() {
		computer.compile();   
		System.out.println("Developing new project");
	}

//Autowired search by type and not by name of class. I	
	
}
