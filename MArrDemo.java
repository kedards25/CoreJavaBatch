//multi-dimensional array
//it is combination of rows and columns
//declared as int[][] mArr=new int[rows][columns]
//it fetches all the columns of each row
//as soon as column size exceeds its limit 
//row increases so in order to access values from a //multi-dimensional array we have to use combination of two loops //embeded in each other
//When we are working for development purpose using multiArr
//try to work with size [2][2]
public class MArrDemo
{
	public static void main(String[] args)
	{
		int[][]mArr=new int[2][2];
		int[][]mArr2={
				{5,6},
				{8,6}	//no comma because array is 					//ending here
			     };
		int[][]mArr3= new int[][]{
				{5,6},
				{8,6}	//no comma because array is 					//ending here
			     };	
		for(int i=0;i<2;i++)	
		{
		//for each value of i,j will be initialized to 0
			for(int j=0;j<2;j++)
			{
				System.out.print(mArr2[i][j]+"\t");
			}
			System.out.println();
		}
	}
}




