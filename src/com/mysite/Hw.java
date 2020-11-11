package com.mysite;

import com.mysite.greeters.*;

public class Hw{ 
	public static void main(String[] args){ 
		System.out.println("hello, World");
		
		MyGreeter greeter = new MyGreeter();
		greeter.getName("Alex");
		
		greeter.printGreeting();
	}
} 
