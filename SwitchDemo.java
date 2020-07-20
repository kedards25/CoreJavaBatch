public class SwitchDemo
{
	public static void main(String[] args)
	{
//in switch we tell compiler to ignore previous cases before //the matching case but we do not instruct it to skip subsequent //cases,so it executes all the cases after matching case
//in order to avoid this and execute only the matching case we use
//break after each case
		int val=Integer.parseInt(args[0]);
		switch(val)
		{
			case 1:
				System.out.println("East");
				break;

			case 2:
				System.out.println("West");
				break;

			case 3:
				System.out.println("North");
				break;

			case 4:
				System.out.println("South");
				break;

			default:	//executes when none of the 					//condition matches
				System.out.println("Invalid value");

		}
	}
}