package com.learning.constructorinvocationdemo;

class DemoP
{
	int num;
	
	DemoP()
	{
		num=7;
	}
	
	DemoP(int n)
	{
		num=n;
	}
}

public class ConstructorInvocationDemo extends DemoP {

	int val;
	
	ConstructorInvocationDemo()
	{
		//in case of no-arg constructor
		//call to super() keyword is given by default 
		//by compiler
		super();	//super() has to be the first statement of constructor
		val=5;
	}
	//Child class constructor has received two params
	//but it requires only one,so it will pass remaining param to parent class
	ConstructorInvocationDemo(int x,int y)
	{
		//super() has to be the first statement of constructor
		super(y);
		val=x;
	}
	
	
	void disp()
	{
		System.out.println("Value from parent "+num+" value from child "+val);
	}
	
	public static void main(String[] args) {
		ConstructorInvocationDemo demo=new ConstructorInvocationDemo();
		demo.disp();
		System.out.println();
		ConstructorInvocationDemo demo2=new ConstructorInvocationDemo(15,25);
		demo2.disp();

	}

}







