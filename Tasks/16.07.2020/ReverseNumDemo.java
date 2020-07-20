public class ReverseNumDemo{

	public static void main(String[] args) {
		int number,n=4;
		
		number=Integer.parseInt(args[0]);
		while(n>0)
		{
			number=number%10;
			number=number/10;
			n--;
		}
		
	}
