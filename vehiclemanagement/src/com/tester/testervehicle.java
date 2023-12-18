package com.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.code.*;
import com.code.vehicle;
import static com.tester.validationrules.validateall;
import com.code.vehicle;
import static com.tester.showroomutils.findmychassisno;

public class testervehicle {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			// List<vehicle>showroom=new ArrayList<>();

			List<vehicle>showroom = new ArrayList<>();
			boolean exit = false;
			int ch=0 ;
			while(!exit) {
				System.out.println("options= 1.add vehicle \n 2 display vehicle \n 3 get vehicle details \n"
						+ " 4 apply discount \n 5 remove specfic vehicle \n   "
						+ " 6 remove vehicle by color \n  7 sort vehicle as per chassis no \n 0 exit"
						 );

				try {
					switch (sc.nextInt()) {

					case 1:
						System.out.println("Enter  chasisNo,  vehicleColor,  price,  manufactureDate,	company");

						// vehicle v1=com.tester.validationrules.validateall(chassisno, color, price,
						// manufacturedate, company, vehicles1);
						vehicle v2 = validateall(sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(), showroom);
						showroom.add(v2);
						System.out.println("vehicle added");

						break;

					case 2:
						System.out.println("showroom details");
						for (vehicle v : showroom) {
							System.out.println(v);
						}

						break;

					case 3: 
						System.out.println("Enter chassis no to get vehicle details=");
						System.out.println(findmychassisno(sc.next(),showroom));
						break;
						
					
					case 4:
						 System.out.println("Enter chassis no to discount");
						vehicle v1 =findmychassisno(sc.next(),showroom);
						v1.setPrice(v1.getPrice()-sc.nextDouble());
						System.out.println("applied discount");
						break;
						
					case 5: 
						System.out.println("Enter chassis no=");
						boolean removed=showroom.remove(new vehicle(sc.next()));
						if(removed)
							System.out.println("Vehicle is removed");
						else throw new invalidexception("vehicle details cont removed");						
						break;
						
						
					case 6:
						System.out.println("Enter color=");
					  vehicle v=new vehicle(sc.next());
					  System.out.println(v);
						
						break;
						
						
					case 7:
					Collections.sort(showroom);
		
					System.out.println(showroom);
					break;
						
						
						
					case 0 :
						System.out.println("exit");
						break;

						
						
						
						
						
						
						
						
					}
					
				} 
				catch (Exception e) {
					System.out.println(sc.nextLine());
					e.printStackTrace();
				}

			}		
		}
		
	}

}
