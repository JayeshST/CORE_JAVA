package com.tester;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.code.customer;

public class serial {

	//for serialization  state of objecrt conver into binary forn and stored in user created file
	
	public static void encoder(List<customer>cust, String name)throws invalidexception, FileNotFoundException, IOException{
		
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(name))){
			
			
			oos.writeObject(cust);
			System.out.println("File stored succesfully");
			
		}
		
	}
	
	
	//deseriallization 
	
	public static List<customer> decoder(String name)throws invalidexception, FileNotFoundException, IOException, ClassNotFoundException{
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(name))){
			
			List<customer>cust=(List<customer>) ois.readObject();
			
			return cust;
		}
		
		
	}
	
	
	
}
