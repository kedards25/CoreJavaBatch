public class AdditionDemo
{	
	//String data type is combination of alphanumeric values
	//and special characters and is the default data type of 	//Java
	public static void main(String[] args)
	{
		//Explicit conversion has to be done from String to 		//integer
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int ans=num1+num2;
		System.out.println("Addition: "+ans);
	}
}