package com.mysite.greeters;

public class MyGreeter{
	
	private String name = "";
	
	public void getName(String name){
		this.name = name;
	}
	
	public void printGreeting(){
		String greeting = name.length() > 3 ? "Hello  "+name +"!": "Hello!";
		System.out.println(greeting);
	}
}