package com.learning.methodlocalinnerclassesdemo;

public class MethodLocalInnerClassesDemo {

	private int NUM=5;
	
	//we can declare a class within method as well
	void AccessMethod()
	{
		class InnerChild
		{
			void showVal()
			{
				System.out.println("Value from parent: "+NUM);
			}
		}
		
		InnerChild child=new InnerChild();
		child.showVal();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodLocalInnerClassesDemo demo=new MethodLocalInnerClassesDemo();
		demo.AccessMethod();
	}

}
