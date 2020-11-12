package com.mysite.informers;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Informer{
	
	public void printNow(){
		SimpleDateFormat formatter = new SimpleDateFormat("hh:mm aa dd-MM-yyyy");
        String formattedDate = formatter.format(new Date());
        System.out.println("Now: " +formattedDate);
	}
}