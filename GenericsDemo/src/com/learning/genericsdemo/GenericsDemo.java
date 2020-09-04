package com.learning.genericsdemo;

//'T' is called as type parameter
//and the class is called as generic class
//and the pair of <> brackets is called as diamond operator
//Generics help us to implement type safety
public class GenericsDemo<T> {

	private T val;
	
	public void setVal(T num)
	{
		val=num;
	}
	
	public void showVal()
	{
		System.out.println("Value received: "+val);
	}
	
	public static void main(String[] args) {
		
		//Generic data types are object specific
		//each data data type is associated with object
		//generic type mentioned on left side is assigned to constructor
		//on right side,so we need not to mention the generic type on right side
		//GenericsDemo<Integer> intGeneric=new GenericsDemo<Integer>();
		GenericsDemo<Integer> intGeneric=new GenericsDemo();
		intGeneric.setVal(10);
		intGeneric.showVal();

		GenericsDemo<Double> doubleGeneric=new GenericsDemo<>();
		doubleGeneric.setVal(10.45);
		doubleGeneric.showVal();
	}

}
