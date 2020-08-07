package com.learning.finallydemo;

public class FinallyDemo {

	int[] arr = { 5, 5, 8, 6, 1, 2 };

	void showArr() {
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(arr[i]);
			}
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		} 
		finally {
			//finally block executes irrespective of exception
			System.out.println("End of the program");
		}
		}
	public static void main(String[] args) {

		FinallyDemo demo=new FinallyDemo();
		demo.showArr();

	}

}
