package com.learning.customexceptions;

import java.util.Scanner;

//in previous code we saw that 
//while implementing subtraction,if second number is greater than first 
//then normal arithmatic exception is thrown 
//instead of stating the specific error
//so in order to throw a specific error we should create and use custom exception class
class SecondNumberException extends Exception
{
	//this class would comprise of a parameterized constructor
	//and the paramer received would be passed to constructor of base class i.e. Exception class
	//and system defined error message would be overwritten
	public SecondNumberException(String msg)
	{
		//here we are using super keyword 
		//to invoke base class constructor
		super(msg);
	}
	
}

public class CustomExceptionDemo {

Scanner scanner=new Scanner(System.in);
	
	int a,b,ans;
	void acceptData()	//called Method
	{
		System.out.println("Enter two numbers");
		a=scanner.nextInt();
		b=scanner.nextInt();
	}
	void subtract()	//called Method
	{
		//so here we are making manual check in order to
		//get proper output
		try
		{
			if(b>a)
			{
			//the exception is thrown to called method and handled there only
			//in the exception
			throw new SecondNumberException("Second number cannot be greater than first one");
			}
			else
			{
			ans=a-b;
			System.out.println("Subtraction is: "+ans);
			}
		}
		//The object of Exception class mentioned in catch block
		//is initialized with constructor thrown by throw keyword
		//i.e. SecondNumberException e=new SecondNumberException("Second number cannot be greater than first one");
		//so this object will invoke constructor of customException class and in turn will
		//pass the message to constructor of base class
		catch (SecondNumberException e) {
			System.out.println("Exception occurred:"+e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomExceptionDemo demo=new CustomExceptionDemo();
		demo.acceptData();
		demo.subtract();
	}

}










