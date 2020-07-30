package com.learning.interfacedemo2;

//we cannot create object of interface as it is incomplete
interface DemoP
{
	
	int NUM=7;
}

//when one interface inherits another interface
//we have to use extends keyword
interface DemoP2 extends DemoP
{
	//this is allowed and allows us to implement encapsulation
	//declared here but not used
	DemoP2 demo=new InterfaceDemo2();
	void show();
}

public class InterfaceDemo2 implements DemoP2 {

	public void show()
	{
		System.out.println("value from interface:"+NUM);
	}
	
	public static void main(String[] args) {
		
		//InterfaceDemo2 demo=new InterfaceDemo2();
		
		//Interface getting initialized with child class is allowed
		//DemoP2 demo=new InterfaceDemo2();
		demo.show();	//abstraction as definition of demo is not here
						//but it is used here

	}

}











