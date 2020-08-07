package com.learning.throwsdemo;

import java.util.Scanner;

public class ThrowsDemo {

	// Throws keyword helps to indicate that the method may throw an error
	Scanner scanner = new Scanner(System.in);

	int a, b, ans;

	void acceptData() {
		System.out.println("Enter two numbers");
		a=scanner.nextInt();
		b=scanner.nextInt();
	}
	//This is useful when we are not sure about any input from the user
	//or while connecting with external resource
	//throws keyword do not check the condition
	//it is suffixed/appended next to method declaration
	void divide()throws ArithmeticException {
					ans=a/b;
					System.out.println("Subtraction is: "+ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsDemo demo=new ThrowsDemo();
		demo.acceptData();
		try
		{
		
			demo.divide();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
