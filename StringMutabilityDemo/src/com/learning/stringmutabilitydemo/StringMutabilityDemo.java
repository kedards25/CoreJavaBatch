package com.learning.stringmutabilitydemo;

public class StringMutabilityDemo {

	public static void main(String[] args) {
		
		/*Everytime we manipulate the string object,
		 *new String object is created in the memory 
		 *hence String is called as immutable class*/
		String str1=new String("Hello");	//String object-immutable
		
		
		/* variable using String as data type 
		 * then those variables are mutable*/
		String str2="Hello";	//reference variable-mutable
		
		System.out.println("Equals function");
		
		if(str1.equals(str2))

			System.out.println("Equal");

		else
			System.out.println("not Equal");
		
		System.out.println("Equals to operator");
		
		if(str1==str2)
		{
			System.out.print("Equal");
		}
		else
			System.out.println("not Equal");
		

	}

}
