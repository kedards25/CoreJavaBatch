package com.learning.singleinheritancedemo;

/*Inheritance allows child class to access non-private members of parent class 
 * thus achieving reusability but parent class cannot access members of child
 * java supports single inheritance in case of classes
 */
class DemoP
{
		int num=7;
		void show()
		{
			System.out.println("value from parent class: "+num);
		}
}
/*
 * if we create main in child it will be able to access 
 * members of parent hence main class will be child class
 * in order to inherit parent class in child we have to use 'extends' keyword
 */
public class SingleInheritanceDemo extends DemoP {

	//we can call members of parent from body of child class
	void disp()
	{
		//here super is referring to function from parent class
		//ignoring function from its own context
		super.show();
		System.out.println("hello from child");
	}
	
	//Code derived from parent class can be given new functionality in child class
	void show()
	{
		//super keyword is used to resolve ambiguity between 
		//functions with same name in parent and child
		super.show();	//show from parent will be invoked
		System.out.println("hello again from child "+num);
	}
	
	public static void main(String[] args) {
		
		SingleInheritanceDemo singleInheritanceDemo=new SingleInheritanceDemo();
		singleInheritanceDemo.disp();
		singleInheritanceDemo.show();
	}

}








