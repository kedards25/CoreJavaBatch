package com.learning.processbasedexecution;

public class ProcessBasedExecution {

	void show()
	{
		System.out.println("Hello from show");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main function started");
		
		System.out.println("Main creating object of class");
		ProcessBasedExecution execution=new ProcessBasedExecution();
		
		System.out.println("Main invoking function");
		execution.show();
		
		System.out.println("Main finished");
	}

}
