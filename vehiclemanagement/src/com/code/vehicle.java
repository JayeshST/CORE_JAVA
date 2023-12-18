package com.code;

import java.time.LocalDate;

public class vehicle implements Comparable<vehicle> {

	private String chassisno;
	private colors color;
	private double price;
	private LocalDate manufacturedate;
	private String company;
	private boolean isavailable;
	
	

	public vehicle(String chassisno, String color, double price, LocalDate manufacturedate, String company
	) {
		super();
		this.chassisno = chassisno;
		this.color = colors.valueOf(color);
		this.price = price;
		this.manufacturedate = manufacturedate;
		this.company = company;
		this.isavailable = isavailable;
	}
	
	
	// add a method to check for duplicate  for dup check in validation rules
	//add overloaded constr to wrap pk
	
	
public vehicle (String chassisno) {
	super();
	this.chassisno=chassisno;
}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof vehicle) {
		vehicle v=(vehicle)obj;
		return this.chassisno.equals(v.chassisno);
		}
		return false;
	}

	@Override
	public String toString() {
		return "vehicle [chassisno=" + chassisno + ", color=" + color + ", price=" + price + ", manufacturedate="
				+ manufacturedate + ", company=" + company + ", isavailable=" + isavailable + "]";
	}


	public String getChassisno() {
		return chassisno;
	}

	public void setChassisno(String chassisno) {
		this.chassisno = chassisno;
	}

	public colors getColor() {
		return color;
	}

	public void setColor(colors color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getManufacturedate() {
		return manufacturedate;
	}

	public void setManufacturedate(LocalDate manufacturedate) {
		this.manufacturedate = manufacturedate;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public boolean isIsavailable() {
		return isavailable;
	}

	public void setIsavailable(boolean isavailable) {
		this.isavailable = isavailable;
	}


	@Override
	public int compareTo(vehicle o) {
		System.out.println("In compare to");
		
		return this.chassisno.compareTo(o.chassisno);
	}
	
	
	
	
	
	
	
	
}
