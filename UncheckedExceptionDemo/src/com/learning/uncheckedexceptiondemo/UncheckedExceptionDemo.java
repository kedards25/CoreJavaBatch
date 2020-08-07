package com.learning.uncheckedexceptiondemo;

public class UncheckedExceptionDemo {

	// unchecked exceptions are the ones which may occur at runtime and
	// compiler is unaware of and it will not prompt us
	// to handle that error while writing the code
	int[] arr = { 5, 5, 8, 6, 1, 2 };

	void showArr() {
		try {
			for (int i = 0; i < 8; i++) {
				System.out.println(arr[i]);
			}
		}
		// one try block can have more than one catch blocks
		// to handle specific exception
		catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		} 
		//if we are unaware of other error those might be thrown by
		//code we can use base class
		//base class should be mentioned in very last catch block or
		//you should not put any specific exception after mentioning 
		//base class in catch block as being parent, it handles all the exceptions
		//this will generate compile time error
		catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UncheckedExceptionDemo exDemo = new UncheckedExceptionDemo();
		exDemo.showArr();
	}

}
