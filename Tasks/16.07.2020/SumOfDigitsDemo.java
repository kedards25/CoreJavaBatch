public class SumOfDigitsDemo{

	public static void main(String[] args) {
		int number,n=1,sum=0,ans;
		
		number=Integer.parseInt(args[0]);
		while(n<=4)
		{
			ans=number%10;
			sum+=ans;
			number=number/10;
			n++;
		}
		System.out.println(sum);
		

	}