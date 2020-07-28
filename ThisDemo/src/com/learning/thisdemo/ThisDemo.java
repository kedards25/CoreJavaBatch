package com.learning.thisdemo;

public class ThisDemo {
	int num;

	ThisDemo(int num)
	{
		//this refers to class level variable
		this.num=num;
		System.out.println("Value from constructor: "+this.num);
	}
	
	void show(int num)
	{
		//this refers to class level variable
		this.num=num;
		System.out.println("Value from method: "+this.num);
	}
	public static void main(String[] args) {
		
		ThisDemo thisDemo=new ThisDemo(15);
		thisDemo.show(25);
	}

}
