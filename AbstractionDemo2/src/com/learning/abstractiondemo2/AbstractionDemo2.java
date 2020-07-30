package com.learning.abstractiondemo2;

abstract class DemoP
{
	abstract void show();
	abstract void disp();
	abstract void greet();
}
//if child class is not implementing/overriding all
//abstract methods of parent class then child also has to be
//declared abstract.It means that child is also incomplete class
//and hence it needs to be extended ahead
abstract class DemoC extends DemoP
{
	@Override
	void show()
	{
		System.out.println("Hello from overridden method show() in DemoC");
	}
	
	@Override
	void disp()
	{
		System.out.println("Hello from overridden method disp() in DemoC");
	}
}

public class AbstractionDemo2 extends DemoC {

	@Override
	void greet()
	{
		System.out.println("Hello from overridden method greet() in Main class");
	}
	
	public static void main(String[] args) {
		AbstractionDemo2 abstractionDemo2=new AbstractionDemo2();
		abstractionDemo2.show();
		abstractionDemo2.greet();
		abstractionDemo2.disp();

	}

}













