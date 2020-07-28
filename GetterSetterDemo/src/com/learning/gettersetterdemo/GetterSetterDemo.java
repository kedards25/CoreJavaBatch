package com.learning.gettersetterdemo;

/*in order to achieve encapsulation,
 * we should declare variables as private and 
 * methods accessing the variables public,
 * these methods are called as getters and 
 * setters of variable,setter method will allow us 
 * to set the value whereas getter method will allow 
 * to return the value for further execution
 */
public class GetterSetterDemo {

	private int val;
	
	public void setVal(int num)
	{
		val=num;
	}
	
	public int getVal()
	{
		return val;
	}
	
	void showVal()
	{
		System.out.println("Value received: "+getVal());
	}
	public static void main(String[] args) {
	
		GetterSetterDemo getterSetterDemo=new GetterSetterDemo();
		getterSetterDemo.setVal(15);
		getterSetterDemo.showVal();

	}

}
