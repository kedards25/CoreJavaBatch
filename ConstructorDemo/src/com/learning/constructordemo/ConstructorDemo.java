package com.learning.constructordemo;

public class ConstructorDemo {
	
	int num;
	//Constructors are special methods which are used to initialize 	
	//member variables at run time/dynamically
	//Constructors have same name as that of class name
	//constructors do not have return type
	//Constructors can have access specifier
	//Constructors cannot be inherited
	public ConstructorDemo()
	{
		//Constructors cannot have any logic within its body,we can 	
		//initialize member variables only and hence constructors 
		//do not have return type
		num=7;
	}
	
	//Constructors can receive parameters as same as other methods
	public ConstructorDemo(int x)
	{
		num=x;
	}
	//Declaring constructor more than once in a class
	//is called as constructor overloading
	
	void show()
	{
		
		
		System.out.println("Value initialized using constructor: "+num);
	}

	public static void main(String[] args) {
		
		//Constructors need not to be invoked separately using objects,
		//they are invoked automatically as soon as object 
		//of the class 	is created
		//if no constructor is defined in class then
		//compiler creates a default constructor 
		ConstructorDemo constructorDemo=new ConstructorDemo();
		constructorDemo.show();
		
		//as many times you create the 	object,
		//those many times constructor will be invoked
		ConstructorDemo constructorDemo2=new ConstructorDemo();
		constructorDemo2.show();
		
		ConstructorDemo constructorDemo3=new ConstructorDemo(15);
		constructorDemo3.show();
		
		ConstructorDemo constructorDemo4=new ConstructorDemo(5);
		constructorDemo4.show();
	}

}
