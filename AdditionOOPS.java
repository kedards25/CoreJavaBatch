//to implement oops approach in program 
//divide your problem statement in I-P-O
//import must be the first statment of your code
import java.util.Scanner;

public class AdditionOOPS
{
	//Enclosing member variables and member functions
	//in class thereby achieving encapsulation
	int num1,num2,ans;
	//Scanner class helps to take input from the user
	//it does not belong to default java.lang package but to	
	//java.util package so we need to import that package
	Scanner sc=new Scanner(System.in);
	void acceptNums()
	{
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
	}

	void subtractNums()
	{
		ans=num1-num2;
	}

	void addNums()
	{
		ans=num1+num2;
	}

	void showAns()
	{
		System.out.println("Answer is: "+ans);
	}
	public static void main(String[] args)
	{
		//to access the members of class,we need to create 			//object of the class through which we will invoke the 			//functions

		//achieving abstraction
		AdditionOOPS demo=new AdditionOOPS();
		System.out.println("Addition operation");
		demo.acceptNums();
		demo.addNums();
		demo.showAns();

		//implementing reusability
		System.out.println("Subtraction operation");
		demo.acceptNums();
		demo.subtractNums();
		demo.showAns();

	}

}