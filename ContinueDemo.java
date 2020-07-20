public class ContinueDemo
{

	public static void main(String[] args)
	{
		int num=0;
		for(int i=1;i<10;i++)
		{
			if(i%3==0)
			{
				continue;//skip subsequent steps
					 //and control is sent 							 //back to loop
			}
			num++;	//1 2 _ 3 4 _ 5 6 _
		}
		System.out.println(num);
	}
}