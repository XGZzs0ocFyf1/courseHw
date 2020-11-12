package com.mysite;

import com.mysite.greeters.*;
import com.mysite.informers.*;


/**
	главный класс
	выводит в консоль текущее время
	выводит Hello + каждый аргумент командной строки
	предполагается что аргументами командной строки будут имена пользователей
	которых приветствует программа
**/
public class Hw{ 
	public static void main(String[] args){
		 
		Informer informer = new Informer();
		informer.printNow();
		
		
		if (args.length == 0)
			return;
		
		System.out.println("Greeting section:");
		
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
