public class GreatestOfThree{

	public static void main(String[] args) {
		int number1,number2,number3;
		number1=Integer.parseInt(args[0]);
		number2=Integer.parseInt(args[1]);
		number3=Integer.parseInt(args[1]);
		if(number1>number2 && number1>number3)
		{
			System.out.println(number1+"is the greatest");
		}
		else
		{
			if(number2>number1 && number2>number3)
			{
				System.out.println(number2+"is the greatest");
			}
			else
				System.out.println(number3+"is the greatest");
		}
		

	}