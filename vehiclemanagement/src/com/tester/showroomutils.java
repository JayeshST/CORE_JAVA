package com.tester;

import java.util.List;

import com.code.vehicle;

public class showroomutils {

	//add a method to return found vehicle ref or thorw exception
	public static vehicle findmychassisno(String chno,List<vehicle>list) throws invalidexception{
		vehicle v1=new vehicle(chno);
		int index=list.indexOf(v1);
		if(index==-1)
			throw new invalidexception("invalid chassisno");
		System.out.println(list.get(index));
		return v1;
	}
	
	
	
	
	
	
	
	
}
