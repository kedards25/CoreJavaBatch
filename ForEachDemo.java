public class ForEachDemo
{
	public static void main(String[]args)
	{
		int[] arr={2,3,4,6,5,1,2};
		int[] arr2={6,78,4,2,5,2,7,6,2,3};
		//forEach loop helps us to iterate through an array
		//without providing the limit(condition)	
		//it will keep iterating through elements of an 		//array till it is finding the next element
		//As soon as next element is not found in an array			//it will stop iterating
		for(int num:arr2) //for each num in arr
		{
			System.out.print(num+"\t");	
		}
		
	}
}