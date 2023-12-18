package com.tester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
//import static com.tester.validationrules.inputall;
//import static com.tester.validationrules.parseandplan;
//import static com.tester.validationrules.duplicate;
//import static com.tester.validationrules.validateplanamount;
//import static com.tester.validationrules.parselocaldate;
import static com.tester.validationrules.*;
import com.code.customer;


import static com.tester.findcustomerdetails.findcustomer;

public class tester {

	public static void main(String[] args) {

		int ch = 0;
		try (Scanner sc = new Scanner(System.in)) {

			List<customer> cust = new ArrayList<>();

			do {
				System.out.println("choose 1 Signup \n 2 Signin(login) \n 3 Dispaly customer \n"
						+ "4  change password \n  5 Sort by email \n 6 sort by dob \n"
						+ "  7 remove customer \n  8 get customer details \n  9  for subscription \n  10 sort  firstname \n 11 sort by email \n   12 serialization \n"
						+ " 13 deseriallization \n 20 exit \n  ");

				try {
					switch (sc.nextInt()) {

					case 1:
						System.out.println(
								"Enter customer details=int customerid, String firstname, String lastname, String email, String password, double regamount,\r\n"
										+ "String dob, String plan ");

						customer c1 = inputall(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), sc.next(), cust);
						cust.add(c1);
						System.out.println("Successfully SignIn");
						break;

					case 2:
						System.out.println("Signin Login");
						System.out.println("Enter email and password");
						customer c3 = new customer(sc.next());

						boolean check = false;
						for (customer c : cust) {
							if (c.equals(c3)) {
								check = true;
								System.out.println("Enter password");
								String s = sc.next();
								if (c.getPassword().contains(s)) {
									System.out.println("login succesfully");
									System.out.println(c);
									break;
								}
								System.out.println("wrong password");
							}
						}
						if (check == false) {
							System.out.println("invalid email");
						}

						break;

					case 3:
						System.out.println("Dispaly Details of customer=");
						for (customer c2 : cust) {
							System.out.println(c2);
							System.out.println("Customer Details....");
						}
						break;

					case 4:
						System.out.println("Enter email");
						customer c5 = new customer(sc.next());
						for (customer c : cust) {
							if (c.equals(c5)) {
								System.out.println("enter password");
								if (c.getPassword().contains(sc.next())) {

									System.out.println("Enter new password");
									c.setPassword(sc.next());
									System.out.println("password change succesfully");
								}

							}
						}

						break;

					case 5:
						Collections.sort(cust);
						System.out.println(cust);
						break;

					case 6:
						System.out.println("Sort by date=");
						Collections.sort(cust, new Comparator<customer>() {
							public int compare(customer o1, customer o2) {
								System.out.println("in comparator");
								return o1.getDob().compareTo(o2.getDob());
							}

						});

						break;
					case 7:
						System.out.println("Enter email=");
						boolean removed = cust.remove(new customer(sc.next()));
						if (removed) {
							System.out.println("customer successfully removed");
							throw new invalidexception("Email is wrong");

						}

						break;

					case 8:
						System.out.println("Enter email=");
						System.out.println(findcustomer(sc.next(), cust));

						break;

					case 9:

						break;

					case 10:

						System.out.println("Sort  firstname");
						Collections.sort(cust, new Comparator<customer>() {

							@Override
							public int compare(customer o1, customer o2) {
								System.out.println("in comparator");

								return o1.getFirstname().compareTo(o2.getFirstname());
							};
						});

					case 11:

						Collections.sort(cust);
						System.out.println(cust);
						break;
						
						
						
					case 12:
						System.out.println("enter file name");
						com.tester.serial.encoder(cust, sc.next());
						break;
						
					case 13:
						System.out.println("Enter file name");
						List<customer>list=com.tester.serial.decoder(sc.next());
						System.out.println(list);
						break;
						
						
						
						

					case 20:
						System.out.println("Exit..........");

						break;

					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e);
					e.printStackTrace();

				}

			} while (ch != 20);

		}

	}

}


//
//11 Jayesh Thombare jay1@gmail.com abc123 450000 2001-08-08 GOLD
//12 rahul patil jay2@gmail.com abc124 450000 2001-07-07 GOLD
//20 anil patil jay3@gmail.com abc125 450000 2001-05-05 GOLD
//21 bhavesh patel jay10@gmail.com abc126 450000 2005-04-04 GOLD
//22 chirag patil jay11@gmail.com abc127 450000 2004-03-03 GOLD
//16 Jayesh Thombare jay6@gmail.com abc128 450000 2003-02-02 GOLD
//17 Jayesh Thombare jay7@gmail.com abc129 450000 2002-01-01 GOLD
