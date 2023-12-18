package com.tester;

import java.util.List;

import com.code.student;

public class findstudent {

	public static student findstudent(String email,List<student>list) throws invalidexception {
		
		student s5=new student(email);
		int index=list.indexOf(s5);
		if(index==-1)throw new invalidexception("invalid exception" );
		return s5;
		
		
		
		
		
	}

}
