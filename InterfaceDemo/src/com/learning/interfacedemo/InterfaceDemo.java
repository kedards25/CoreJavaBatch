package com.learning.interfacedemo;

interface DemoP
{
	//we cannot declare any variable in an interface but we can have 	
	//constants in an interface
	int NUM=7;
	
}

interface DemoP2
{
	
	//Methods in Interface are public abstract by default
		void show();
}
//multiple inheritance implemented
public class InterfaceDemo implements DemoP,DemoP2 {

	public void show()
	{
		System.out.println("value from interface: "+NUM);
	}
	
	public static void main(String[] args) {
		
		InterfaceDemo demo=new InterfaceDemo();
		demo.show();

	}

}
