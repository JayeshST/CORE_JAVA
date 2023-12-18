package com.tester;

import java.lang.reflect.InaccessibleObjectException;
import java.time.LocalDate;
import java.util.List;

import com.code.serviceplan;
import com.code.student;

public class validationrules {

	
	
	//rules for enum plan
	
	public static serviceplan parseplan (String plan)throws invalidexception{
		
		return serviceplan.valueOf(plan);
		
	}
	
	//rules for LocalDate
	
//	public static LocalDate parselocaldate(String dob)throws invalidexception{
		
//		LocalDate date1=parselocaldate(dob);
//		LocalDate checkdate=LocalDate.of(2010, 01, 01);
//		if(date1.isBefore(checkdate))
//			throw new invalidexception("date no Before Checkdate");
//		
//		return date1;
		
//	}
	
	public static LocalDate parselocaldate(String dob)throws invalidexception{
	
	LocalDate date1=LocalDate.parse(dob);
	LocalDate checkdate=LocalDate.of(2001, 01, 01);
	if(date1.isBefore(checkdate)) {

	}
	
	return date1;
	
}

	
	//rule of duplicate email
	
	public static void duplicate(String email,List<student>list)throws invalidexception{
	
		String pattern="[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
		if(!email.matches(pattern)) {
			throw new invalidexception("Pattern not match");
		}
		
		student s2=new student(email);
		if(list.contains(s2)) {
		throw new invalidexception("duplicate email");
		}
	}
	
//validation rules for all 
	
	public static student inputall(int readerid, String fname, String lname, String email, String password, double regamount,
			String dob, String plan,List<student>list)throws invalidexception{
		
		
		serviceplan plan1=parseplan(plan);
		LocalDate date1=parselocaldate(dob);
		duplicate(email,list);
		
		
		
		return new student(readerid, fname, lname, email, password, regamount, date1, plan);
		
		
		
		
		
	}
	
	

	
}
