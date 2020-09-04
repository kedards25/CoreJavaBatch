package com.learning.innclassesdemo;

//in this case main class will be  parent class 
//as child class will be defined in body of parent
public class InnerClassesDemo {

	//member variable of parent is declared as private
	private int NUM=5;
	
	class InnerChild{
		//As child is member of parent
		//we need not to use any keyword to inherit	
		void showVal()
		{
			//child being member of parent
			//can access private members of parent
			System.out.println("value from parent class: "+NUM);
		}
	}
	
	//to access members of child class 
	//we shall create object of child class
	InnerChild child=new InnerChild();
	
	void accessMethod()
	{
		child.showVal();
	}
	
	
	
	public static void main(String[] args) {
		InnerClassesDemo demo=new InnerClassesDemo();
		demo.accessMethod();

	}

}
