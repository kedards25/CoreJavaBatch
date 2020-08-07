package com.learning.throwdemo;

import java.util.Scanner;

public class ThrowDemo {

	//Throw keyword helps to throw the exception manually based on 
	//any condition
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
		if(b>a)
		{
			//the exception is thrown to called method and handled there only
			//in the exception
			throw new ArithmeticException();
		}
		else
		{
			ans=a-b;
			System.out.println("Subtraction is: "+ans);
		}
	}
	
	public static void main(String[] args) {
		
		ThrowDemo demo=new ThrowDemo();
		//we shall put the method call in try..catch block
		//so if called method throws an exception then
		//calling method should receive it and handle the same

		//calling method
		demo.acceptData();
		
		try {
			//calling method
			demo.subtract();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}








