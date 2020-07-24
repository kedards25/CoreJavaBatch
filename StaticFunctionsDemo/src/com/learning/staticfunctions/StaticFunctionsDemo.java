package com.learning.staticfunctions;

public class StaticFunctionsDemo {

	//static is called as access modifier
	//functions or variables declared as static 
	//are considered to exist even before execution of class
	//hence they are also called as class-level-resources
	//static modifier allows us to access them without creating object
	//of the class
	
	int num1=5;
	static int num2=7;
	static void show()
	{
		//System.out.println("Hello from static function");
		//System.out.println("variables are: "+num1+" and "+num2);
		//static functions can access only static variables
		System.out.println("variable is: "+num2);
		num2++;
		System.out.println("variable after increment: "+num2);
	}
	
	void disp()
	{
		//non-static functions can access static and non-static 
		//variables both
		System.out.println("variables are: "+num1+" and "+num2);
		num1++;
		System.out.println("variable after increment: "+num1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static variables have single copy per class
		show();
		StaticFunctionsDemo.show();
		System.out.println();
		StaticFunctionsDemo staticFunctionsDemo=new StaticFunctionsDemo();
		staticFunctionsDemo.disp();
		
		//objects maintain their own 
		//copy of variables to work upon
		StaticFunctionsDemo staticFunctionsDemo2=new StaticFunctionsDemo();
		staticFunctionsDemo2.disp();
	}

}
