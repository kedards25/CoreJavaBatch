package com.learning.fileinputstreamdemo;

import java.io.FileInputStream;
import java.io.IOException;
/*we can mention more than one resources separated by a semicolon ';'
	try block will help to open mentioned resources one by one
  if it gets an error while opening any of the resources then it will
	jump to catch block
  If any error occurs while performing operations on any resource then it will jump to catch block
  Try with resources will try to close the resources in the order opposite in which they were opened
  This is achieved with Autoclosable interface
  if it gets an error while closing the resources then also it will
	jump to catch block thus avoiding lengthy finally block
*/
public class FileInputStreamDemo {

	int i;
	char c;
	
	void readSample()
	{
		try(FileInputStream f=new FileInputStream("E:\\Online Sessions\\Core Java\\sample.txt"))
		{
			
			//checking and reading data if file is not empty
			while((i=f.read())!=-1)
			{
				c=(char)i;
				System.out.print(c);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//in order to avoid lengthy try catch block
		//we need to implement try with resources
//		finally {
//			try {
//				f.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStreamDemo demo=new FileInputStreamDemo();
		demo.readSample();
		
	}

}
