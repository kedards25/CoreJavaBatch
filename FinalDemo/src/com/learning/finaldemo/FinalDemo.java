package com.learning.finaldemo;

//anything which is declared as final
//cannot be changed in child class
//if a class is declared as final then it cannot be inherited
//if a method is declared as final then it cannot be overridden
//if a variable is declared as final then it cannot be initialised with 
//new values
 class DemoP
{
	int num=7;
	
	final void show()
	{
		System.out.println("from parent");
	}
}

public class FinalDemo extends DemoP {

	void show()
	{
		num=9;
		System.out.println("from child");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
