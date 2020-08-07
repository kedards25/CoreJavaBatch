package com.learning.rethrowdemo;

import java.util.Scanner;

public class RethrowDemo {

	Scanner scanner = new Scanner(System.in);

	int a, b, ans;

	void acceptData() // called Method
	{
		System.out.println("Enter two numbers");
		a = scanner.nextInt();
		b = scanner.nextInt();
	}

	void subtract()	//called Method
	{

		try
		{
			if(b>a)
			{

				throw new ArithmeticException();
			}
			else
			{
				ans=a-b;
				System.out.println("Subtraction is: "+ans);
			}
		}
		catch (ArithmeticException e) {
			System.out.println("Exception occurred and being rethrown from catch block within method");
			throw e;	//re-throwing exception from body of the catch block
		}
	}

	public static void main(String[] args) {
		RethrowDemo demo=new RethrowDemo();
		demo.acceptData();
		try
		{
		demo.subtract();
		}
		catch (Exception e)	//catching and handling the re-thrown exception 
		{
			System.out.println("Exception received in main: "+e);
		}
	}

}
