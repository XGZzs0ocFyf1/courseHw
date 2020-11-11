package com.mysite;

import com.mysite.greeters.*;

public class Hw{ 
	public static void main(String[] args){
		 
		for (String x:args){
			greetUser(x);
		}
	}
	
	private static void greetUser(String name){
		MyGreeter greeter = new MyGreeter();
		greeter.getName(name);
		greeter.printGreeting();
	}

} 
