package com.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import static com.tester.findstudent.findstudent;
import com.code.student;
import static com.tester.validationrules.inputall;

public class tester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			List<student> stud = new ArrayList<>();

			int ch = 0;
			do {
				System.out.println("Choose 1.sign up \n 2.sign in \n 3 change password \n 4 unsubscriber reader \n"
						+ " 5 display all reader \n 6 sort students  by email \n  sort by date \n 7 show sp student details \n"
						+ "8 remove sp student \n 9 sort by fname \n 10 exit \n ");

				try {
					System.out.println("Enter choise");
					switch (sc.nextInt()) {

					case 1:

						System.out.println("Sign up");
						System.out.println(
								"enter all details int readerid, String fname, String lname, String email, String password, double regamount,\r\n"
										+ "String dob, String plan");
						student s1 = inputall(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), sc.next(), stud);
						stud.add(s1);
						System.out.println("student added..........");
						break;

					case 2:

						System.out.println("sign in");
						System.out.println("Enter emai and password");
						student s3 = new student(sc.next());
						boolean check = false;
						for (student s : stud) {
							if (s.equals(s3))

								check = true;
							 
							System.out.println("Enter password");
							String s4=sc.next();
							if(s.getPassword().contains(s4)){
								System.out.println("login success");
							System.out.println(s);
							}
							
							
							
						}
						break;
						
						
					case 3: 
						
						System.out.println("change password");
						System.out.println("Enter email");
						student s5=new student(sc.next());
						for(student s:stud) {
							if(s5.equals(s)) {
							System.out.println("enter password");
							if(s.getPassword().contains(sc.next())){
								System.out.println("Enter new password");
								s.setPassword(sc.next());
								System.out.println("password changed");
							}
						}}
						
						break;
					case 4:
						System.out.println("Unsubscriber reader");
						break;
						
						
						
				
						
						
						
						
						
						

					case 5:
						System.out.println("display all reader");
						for (student s2 : stud) {
							System.out.println(s2);
						}

						break;

						
						
					case 6:
						System.out.println("sort by email");
					Collections.sort(stud);
					System.out.println(stud);
						
						break;
					case 7:
						
						System.out.println("sp student");
						System.out.println("Enter email");
					System.out.println(findstudent(sc.next(), stud));
						
						break;
						
						
					case 8:
						System.out.println("remove sp student");
						System.out.println("Entet email");
						boolean removed=stud.remove(sc.next());
						if(removed) {
							System.out.println("removed successfully");
						throw new invalidexception("plse enter valid email");
						}
						break;
						
						
					case 9:
						System.out.println("sort by fname");
						Collections.sort(stud, new Comparator<student>() {
							@Override
							public int compare(student o1, student o2) {
	
							return o1.getFname().compareTo(o2.getFname());
							}
						});
						
						break;
						
						
					
						
						
						
						
						
						
					}
					
					
					
					
					
					
					
					
					

				} catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
					e.printStackTrace();
				}

			} while (ch != 10);

		}

	}

}
