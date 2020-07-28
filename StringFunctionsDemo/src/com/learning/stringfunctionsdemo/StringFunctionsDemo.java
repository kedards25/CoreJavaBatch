package com.learning.stringfunctionsdemo;

public class StringFunctionsDemo {

	public static void main(String[] args) {
		String str="Hello World";
		//System.out.println(str.length());	//counts space as well
		
		//System.out.println(str.charAt(4));	//gets character at given index,starting from 0
		
//		char[] str2=new char[5];
//		//str.getChars(startIndexToCopyFrom, EndIndex-1, DestinationArray, 
//		//Offset_From_Which_Data_ShouldBe_Copied_to_Array);
//		str.getChars(6, 11, str2, 0);
//		System.out.println(str2);
		
//		//if first string is greater than second then positive value will be shown
//		//else negative and if both are equal then 0 will be shown
//		String str3="Hello";
//		System.out.println(str.compareTo(str3));	//returns int value
		
//		System.out.println(str.startsWith("World"));
		
//		System.out.println(str.endsWith("World"));
		
//		System.out.println(str.indexOf('o'));
		
//		System.out.println(str.lastIndexOf('o'));
		
//		System.out.println(str.substring(6));
		
//		String str4=" everyone";
//		System.out.println(str.concat(str4));
		
//		System.out.println(str.replace('e', 'E'));
		
//		System.out.println(str.toUpperCase());
		
//		System.out.println(str.toLowerCase());
		
//		//Trims the space from both ends
//		String str5="			Good 			Morning		";
//		System.out.println(str5.trim());
		
//		char[] strArr=str.toCharArray();
//		for(char chr: strArr)
//		{
//			System.out.println(chr);
//		}
		
//		String str6="hello world";
//		System.out.println(str.equals(str6));
//		System.out.println(str.equalsIgnoreCase(str6));
		
		//generally toString method is used to convert value into String
		//but toString does not work with premitive data types
		
//		char[] strArr2=str.toCharArray();
//		System.out.println(strArr2.toString());
		int num=8;
		System.out.println(String.valueOf(num)+5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
