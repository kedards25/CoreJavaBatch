package com.learning.paramdemo;

public class ParamDemo {

	//you can pass n number of parameters to the function
	void show(int num)
	{
		num++;
		System.out.println("Value received in param:"+num);
	}
	
	public static void main(String[] args) {
		ParamDemo paramDemo=new ParamDemo();
		paramDemo.show(15);

	}

}
