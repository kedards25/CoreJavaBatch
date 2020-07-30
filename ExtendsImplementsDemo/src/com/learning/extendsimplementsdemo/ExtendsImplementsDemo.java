package com.learning.extendsimplementsdemo;

interface DemoP
{
	int NUM=7;
}

class DemoP2
{
	void show()
	{
		System.out.println("Hello from DemoP2");
	}
}
//sequence of inheritance cannot be changed
//sequence of inheriting will be in alphabetic order
public class ExtendsImplementsDemo extends DemoP2 implements DemoP {

	
	void disp()
	{
		System.out.println("value from DemoP: "+NUM);
	}
	public static void main(String[] args) {
		
		ExtendsImplementsDemo demo=new ExtendsImplementsDemo();
		demo.show();
		demo.disp();

	}

}
