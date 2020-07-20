public class IfDemo
{
	public static void main(String[] args)
	{
		//int num=7;
		int num=Integer.parseInt(args[0]);
		if(num>5)
		{
			System.out.println(num+" is greater than 5");
		}
		else
		{
			System.out.println(num+" is smaller than 5");
		}

	}
}