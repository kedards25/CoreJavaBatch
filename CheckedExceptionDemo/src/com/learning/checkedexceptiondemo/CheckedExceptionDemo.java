package com.learning.checkedexceptiondemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptionDemo {

	
	
	void connectDB()
	{
		//Driver for particular technology is required to connect to it
		//Driver is an external jar file that we need to add in our program
		//In case if we do not add any driver,our code will not work
		//so in order to handle the missing driver error we should use
		//try..catch block and compiler
		//prompts us to handle that error while writing the code
		
		
		try
		{
			Connection con=DriverManager.getConnection("abc", "xyz", "pqr");
		}
		//as we are unaware of exact error,we are handling it with
		//object of base class i.e. Exception class
		//which wraps all the objects of exception class
		//after executing we would get to know which specific error 
		//we are facing and then we can replace the base class with
		//specific exception
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		CheckedExceptionDemo exDemo=new CheckedExceptionDemo();
		exDemo.connectDB();

	}

}
