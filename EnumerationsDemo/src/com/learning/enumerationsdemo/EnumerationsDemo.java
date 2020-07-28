package com.learning.enumerationsdemo;

//Enumerations are treated as level that of class 
//hence it can be declared outside the class as well 
enum Colors{RED,ORANGE,BLUE,VIOLET,GREEN,YELLOW};
//Enumerations allow developers to provide range of values to 		
//user to choose from


public class EnumerationsDemo {

	void showEnums()
	{
		//color is an iterator of type Colors
		//which allows us to iterate through values of 
		//Colors enum
		//for each value of color in Colors.value
		//perform the logic mentioned in body
		for(Colors color:Colors.values())
		{
			System.out.println(color);
		}
	}
	
	public static void main(String[] args) {
		
		EnumerationsDemo demo=new EnumerationsDemo();
		demo.showEnums();
	}

}
