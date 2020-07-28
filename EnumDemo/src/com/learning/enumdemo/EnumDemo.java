package com.learning.enumdemo;

enum Colors{RED,ORANGE,BLUE,VIOLET,GREEN,YELLOW};

public class EnumDemo {

	void showEnumVal(Colors colr)
	{
		switch(colr)
		{
			case RED:
				System.out.println("You chose red color");
				break;
			case ORANGE:
				System.out.println("You chose orange color");
				break;
			case BLUE:
				System.out.println("You chose blue color");
				break;
			case VIOLET:
				System.out.println("You chose violet color");
				break;
			case GREEN:
				System.out.println("You chose green color");
				break;
			case YELLOW:
				System.out.println("You chose yellow color");
				break;
		}
	}
	
	public static void main(String[] args)
	{
		EnumDemo enumDemo=new EnumDemo();
		enumDemo.showEnumVal(Colors.VIOLET);
	}

}
