package com.code;

import java.time.LocalDate;

public class student  implements Comparable<student>{
// this for natural orderring  only one time write 
	
//	+-Build Library management system
//
//	Typical  Options
//	1. Sign up (Reader registration)
//	2. Sign in (login)
//	i/p : email n password
//	3. Change password
//	i/p : email n old password n new password
//	4. Un subscribe Reader
//	i/p : Reader email
//	5. Display all Readers.
//	0. Exit 

//	Design 
//	Identify the core classes/enums involved
//	1. Reader class (core class)
//	state  : Reader id(int) ,first name, last name (string),email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
//	Must generate Reader ids automatically : auto increment)
//	PK(UID) : email
//
//	Add suitable constructors.
//
//
//	2. ServicePlan : enum
//	ServicePlan charges : 
//	SILVER : 1000 
//	GOLD : 2000
//	DIAMOND : 5000
//	PLATINUM : 10000
//
//
//	3. custom exception class
//
//	4. validation rules
//	4.1 no dup Readers 
//	(i.e if the Reader tries to register using existing email , throw exception)
//
//	4.2 Validate plan
//	plan must be of supported types
//
//	4.3 reg amount must match with the plan
//
//
//	5. Tester, with UI , use scanner
//	Accept Reader details
//	Validate i/ps (single method)
//	In case of successful validations , display Reader details via toString or display error mesg via custom exception.

	
	
	
	private int readerid;
	private String fname,lname,email,password;
	private double regamount;
	private LocalDate dob;
	private serviceplan plan;
	private static int idcounter;
	static {
		idcounter=1;
	}
	public student(int readerid, String fname, String lname, String email, String password, double regamount,
			LocalDate dob, String plan) {
		super();
		this.readerid = idcounter++;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.regamount = regamount;
		this.dob = dob;
		this.plan = serviceplan.valueOf(plan);
	}
	@Override
	public String toString() {
		return "student [readerid=" + readerid + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", password=" + password + ", regamount=" + regamount + ", dob=" + dob + ", plan=" + plan + "]";
	}
	public int getReaderid() {
		return readerid;
	}
	public void setReaderid(int readerid) {
		this.readerid = readerid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
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
		student.idcounter = idcounter;
	}
	
	
	//for duplicate identify 
	public student(String email) {
		this.email=email;
	}
	
	
	@Override
		public boolean equals(Object obj) {
			if(obj instanceof student) {
				student s1=(student)obj;
				return this.email.equals(s1.email);
			}
			return false;
		}
	@Override
	public int compareTo(student o) {
		System.out.println("to compare");
		return this.email.compareTo(o.email);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
