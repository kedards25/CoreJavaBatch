package com.learning.anonymousdemo;

public class AnonymousClassDemo {

	private int NUM=5;
	
	void showVal()
	{
		//we will create an instance(object) of Object class
		//from java.lang package which is imported by default in program
		Object obj=new Object() {
			public String toString()
			{
				System.out.println("toString method invoked");
				return String.valueOf(NUM);
				
				//primitive data types cannot be converted to
				//String by toString() method,so we need to use
				//String.valueOf() function
				//toString method helps to convert derived and reference types
				//into String
			}
		};	//constructor call ends here
		
		System.out.println("String val: "+obj.toString());
	}
	
	public static void main(String[] args) {
		
		AnonymousClassDemo demo=new AnonymousClassDemo();
		demo.showVal();
		
		//while compiling the code,compiler encounters two classes
		//but does not find the second class hence it creates a
		//class with same name as that of Main class but with
		//$1 suffix
		
		
		
		

	}

}
