package com.mkyong;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	
	public static void main (String [] args){
		
		System.out.println("id "+getId()); 
		
	}
	
	public static String getId(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmssS");
		return sdf.format(new Date());
	}

}
