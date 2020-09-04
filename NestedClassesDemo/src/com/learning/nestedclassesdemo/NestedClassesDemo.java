package com.learning.nestedclassesdemo;


//Nested classes are inner classes with static modifier
public class NestedClassesDemo {

private static int NUM=5;
	
	static class InnerChild{
		//As child is member of parent
		//we need not to use any keyword to inherit	
		static void showVal()
		{
			//child being member of parent
			//can access private members of parent
			//static methods can access only static members 
			//so parent class members are declared as static
			System.out.println("value from parent class: "+NUM);
		}
	}
	
	
	static void accessMethod()
	{
		InnerChild.showVal();
	}
	
	public static void main(String[] args) {
		accessMethod();

	}

}
