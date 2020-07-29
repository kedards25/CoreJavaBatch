package com.learning.abstractiondemo;
/*abstraction will allow us to show what is going to happen 
 * but not how it will happen
 * In order to achieve abstraction,we can create abstract classes
 * abstract classes are the one in which there are methods without body,
 * only method declaration and not the definition
 */

//if a class contains any abstract method,then class also has to be
//declared abstract
//abstract class can contain abstract and non-abstract methods
abstract class DemoP {

	//Abstract methods are declared with keyword abstract
	abstract void disp();
	void show()
	{
		System.out.println("hello from abstract class");
	}
}

/*
 * we can say that abstract classes are incomplete classes and 
 * hence they need to be inherited and given body to methods from abstract class
 */
//child class must implement abstract methods from parent class
public class AbstractionDemo extends DemoP {
	
	void disp()
	{
		System.out.println("Hello from implemented method in child");
	}
	
	//child class can have its own function as well
	void greet()
	{
		System.out.println("Good Morning");
	}
	public static void main(String[] args) {
		
		//As these classes are incomplete we cannot create objects of abstract classes
		//DemoP demoP=new DemoP();	//errorenous line
		
		DemoP demo=new AbstractionDemo();
		//AbstractionDemo demo=new AbstractionDemo();
		demo.disp();
		demo.show();
		//demo.greet();	//cannot be accessed using object of parent class

	}

}




















