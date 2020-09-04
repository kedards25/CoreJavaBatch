package com.learning.wildcardsdemo;

public class WildcardsDemo<T> {
	
	T val;
	
	void setVal(T num)
	{
		val=num;
	}
	
	void showVal()
	{
		System.out.println(val);
	}
	//wcd is an object of class WildcardsDemo
	//any class which is child of Number class can be passed as
	//generic type
	void compare(WildcardsDemo<? extends Number> wcd)
	{
		//val will receive value assigned by demo1
		//whereas wcd.val will receive value assigned by demo2
		if(val==wcd.val)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

	public static void main(String[] args) {
		WildcardsDemo<Integer> demo1=new WildcardsDemo();
		demo1.setVal(15);
		
		WildcardsDemo<Integer> demo2=new WildcardsDemo();
		demo2.setVal(25);
		
		demo1.compare(demo2);

	}

}
