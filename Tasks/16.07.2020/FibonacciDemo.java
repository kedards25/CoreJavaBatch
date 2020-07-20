public class FibonacciDemo
{
	public static void main(String[] args)
	{
		int a=0,b=1,sum=0;
		System.out.print(a+" "+b+" ");
		do
		{
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}while(sum<100);
		
	}
}