//Array is collection of elements of same data type stored in //adjecant memory locations
//To access an array element,we need to use an index of that element
//index ranges from 0 to n-1..where n is the size of array
public class ArrayDemo
{
	public static void main(String[] args)
	{
		int[] arr=new int[3];
		//int[] arr2=new int[3]{5,8};//compilation error
		int[] arr2=new int[]{5,8,7};//compilation error
		int[] arr3={4,7,3};

		arr[0]=25;
		arr[1]=47;
		arr[2]=8;

		/*for(int i=0;i<3;i++)
		{
			System.out.println(arr2[i]);
		}*/
		
		//it will give a runtime error
		//as arr3 is having only 3 values and loop is 		//running 4 times
		//code will compile successfully but will throw a 		//runtime error
		for(int i=0;i<4;i++)
		{
			System.out.println(arr3[i]);
		}
	}
}