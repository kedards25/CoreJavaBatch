package com.learning.polymorphismdemo;

//Static polymorphism
//function is aware of parameters it is going to receive
//This can be achieved in single class
//methodology is called as overloading
public class PolymorphismDemo {

	void showValues()
	{
		System.out.println("values are: 5 and 7");
	}
	
	void showValues(int a,int b)
	{
		System.out.println("Values received: "+a+" and "+b);
	}
	
	void showValues(int a,int b,int c)
	{
		System.out.println("Values received: "+a+","+b+" and "+c);
	}
	
	void showValues(int a,float b)
	{
		System.out.println("Values received: "+a+" and "+b);
	}
	
	//following method is considered to be overloaded logically but 
	//not technically
//	void showValues(int b,int a)
//	{
//		System.out.println("Values received: "+a+" and "+b);
//	}
	
	
	public static void main(String[] args) {
		
		PolymorphismDemo polymorphismDemo=new PolymorphismDemo();
		polymorphismDemo.showValues();
		//for decimal values java by default accepts values in double
		//so in order to use the value as float,we have to suffix it as F
		polymorphismDemo.showValues(5, 7.5F);
		polymorphismDemo.showValues(8, 9);
		polymorphismDemo.showValues(10, 20, 30);
		
		

	}

}
