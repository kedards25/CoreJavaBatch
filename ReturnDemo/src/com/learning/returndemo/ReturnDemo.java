package com.learning.returndemo;

public class ReturnDemo {

	//called function can pass the value to calling function
	//but in programming we call this as returning the value to 
	//calling function
	//if a function is not returning anything then its return type
	//is "void" but if a function is returning a value then type of 
	//value it is returning will be the return type of the function
	
	int val=7;
	
	//following function is returning the val
	//which is int hence return type of the function would be int
	//type of value given function is returning will be return type of 
	//that function
	int sendVal()	//called function
	{
		val++;
		return val;
	}
	
	void acceptVal()
	{
		//both functions being in same class,need not to be accessed
		//using object,we can access them directly
		int num=sendVal();
		System.out.print("Value received in acceptVal function: "+num);
	}
	
	public static void main(String[] args) {
		ReturnDemo returnDemo=new ReturnDemo();
		
		//value being returned by called function must be accepted by 
		//calling function and should be stored in a variable
		int receivedVal=returnDemo.sendVal();//calling function
		System.out.println("Value received in main function: "+receivedVal);
		
		returnDemo.acceptVal();

	}

}
