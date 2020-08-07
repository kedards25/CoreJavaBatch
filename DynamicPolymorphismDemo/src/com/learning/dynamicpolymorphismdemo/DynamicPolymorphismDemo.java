package com.learning.dynamicpolymorphismdemo;

//we need inherited classes
//methodology is called as overridding
//function call will be decided at runtime
class DemoP
{
	void show()
	{
		System.out.println("Show from parent class");
	}
	
	void disp()
	{
		System.out.println("disp from parent class");
	}
}


public class DynamicPolymorphismDemo extends DemoP {

	@Override
	void show()
	{
		System.out.println("Show from child class");
	}
	
	@Override
	void disp()
	{
		System.out.println("disp from child class");
	}
	
	void greet()
	{
		System.out.println("own method of child class");
	}
	public static void main(String[] args) {
		
		
		//though we are creating object of parent class
		//it is being associated with child class
		//so child methods will be invoked
		//basically method call will be decided at runtime
		//when object of class is created
		//this is called as upward casting
//		DemoP demo=new DynamicPolymorphismDemo();
//		demo.show();
//		demo.disp();
		//greet method is not there in parent class so
		//we cannot access greet method from parent object
		//demo.greet();
		
		//following code compiles successfully but will throw an
		//error at run time
		//DemoP demoP=new DemoP();
		//this is called as downward casting
		//DynamicPolymorphismDemo d=(DynamicPolymorphismDemo)demoP;
		//d.show();
		
	}

}
