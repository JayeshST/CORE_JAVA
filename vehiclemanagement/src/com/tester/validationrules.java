package com.tester;
import java.time.LocalDate;
import java.util.List;

import com.code.*;
public class validationrules {

//add a method to parse n validate color
 
public static colors parsevalidatecolor(String color)throws IllegalArgumentException{
	return colors.valueOf(color.toUpperCase());
}
	
	//add a method to parse date 
	
	public static LocalDate parsevalidatedate(String date) throws invalidexception{
		
		LocalDate manudate=LocalDate.parse(date);
		LocalDate checkdate=LocalDate.of(2001, 01, 01);
		if( manudate.isBefore(checkdate))
			throw new invalidexception("Not match date");
		return manudate;
	}
	
	
	// add a method to check for duplicate
	public static void checkdup(String chno,List<vehicle>v1) throws invalidexception{
		
		vehicle v2=new vehicle(chno);
		if(v1.contains(v2));
		throw new invalidexception("duplicate no");
	}
	

	
	// add a method to validate all i/ps
	
	public static vehicle validateall(String chassisno,String color, double price, String manufacturedate, String company,List<vehicle>vehicles1)
	throws IllegalArgumentException,invalidexception
	{
		colors colors=parsevalidatecolor(color);
		LocalDate validateDate=parsevalidatedate(manufacturedate);
		
		
		return new vehicle(chassisno,color,price,validateDate,company);
		
		
	}
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
