package com.tester;

import com.code.serviceplan;
import com.code.customer;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.List;

import com.code.*;

public class validationrules {

	// add a method to parse a serviceplan

	public static serviceplan parseandplan(String plan) throws IllegalArgumentException {
		return serviceplan.valueOf(plan);

	}

	// add a method to validate regamount with plan

	public static void validateplanamount(serviceplan plan, double regamount)
			throws invalidexception, InputMismatchException {

		if (plan.getCost() != regamount)
			throw new invalidexception("Reg amount not match");

	}

//add method to parse LocalDate

	public static LocalDate parselocaldate(String dob) throws invalidexception {
		LocalDate date1 = LocalDate.parse(dob);

		return date1;
	}

//add method to check duplicate email,

	public static void duplicate(String email, List<customer> list) throws invalidexception {

		String pattern = "[a-z]+[a-z0-9]+@[a-z]*\\.(com|org|net)";
		if (!email.matches(pattern)) {
			throw new invalidexception("Email invalid");
		}

		customer c1 = new customer(email);
		if (list.contains(c1))
		throw new invalidexception("Duplicate email already used");
 
	}

// add method to add all inputs

	public static customer inputall(int customerid, String firstname, String lastname, String email, String password,
			double regamount, String dob, String plan, List<customer> list) throws invalidexception {
		serviceplan plans = parseandplan(plan);
		LocalDate date = parselocaldate(dob);
		duplicate(email,list);

		return new customer(customerid, firstname, lastname, email, password, regamount, date, plan);
	}

}
