package com.code;

import java.io.Serializable;
import java.time.LocalDate;

public class customer  implements Comparable<customer>,Serializable{

	private int customerid;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private double regamount;
	private LocalDate dob;
	private serviceplan plan;
	private static int idcounter;
	static {
		
		idcounter=1;
	}
	public customer(int customerid, String firstname, String lastname, String email, String password, double regamount,
			LocalDate dob, String plan) {
		super();
		this.customerid = idcounter++;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.regamount = regamount;
		this.dob = dob;
		this.plan = serviceplan.valueOf(plan);
	
	}
	
	public customer(String email) {
		this.email=email;
	}
	
	
	

	
	

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegamount() {
		return regamount;
	}

	public void setRegamount(double regamount) {
		this.regamount = regamount;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public serviceplan getPlan() {
		return plan;
	}

	public void setPlan(serviceplan plan) {
		this.plan = plan;
	}

	public static int getIdcounter() {
		return idcounter;
	}

	public static void setIdcounter(int idcounter) {
		customer.idcounter = idcounter;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof customer) {
			customer c1=(customer)obj;
			return this.email.equals(c1.email);
		}
		return false;
	}

	@Override
	public int compareTo(customer o) {
		System.out.println("Compare To");
		return this.email.compareTo(o.email);
	}

	
	

	
	
	
	
	
	
	@Override
	public String toString() {
		return "customer [customerid=" + customerid + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", password=" + password + ", regamount=" + regamount + ", dob=" + dob + ", plan=" + plan
				+ "]";
	}
	

	
	
	
	
}

