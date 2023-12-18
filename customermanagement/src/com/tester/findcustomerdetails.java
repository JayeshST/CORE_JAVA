package com.tester;
import java.util.List;

import com.code.customer;
public class findcustomerdetails {

	
	public static  customer findcustomer(String email,List<customer>list) throws invalidexception{
	customer c1=new customer(email);
	int index=list.indexOf(c1);
	if(index==-1)
		throw new invalidexception("invalid email");
	System.out.println(list.get(index));
	return c1;
	}
	
}
