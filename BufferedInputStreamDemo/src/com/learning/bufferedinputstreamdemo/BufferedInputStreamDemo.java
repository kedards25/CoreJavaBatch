package com.learning.bufferedinputstreamdemo;

import java.io.*;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {
//		double backslash indicates java to ignore it as escape character
//		and consider it as path separator
		String filePath = "Sample Data";

		byte[] bufferedFile = filePath.getBytes();

//		try (ByteArrayInputStream byteInputStream=new ByteArrayInputStream(bufferedFile);
//				BufferedInputStream buffInputStream=new BufferedInputStream(byteInputStream)
		try (BufferedInputStream buffInputStream = 
				new BufferedInputStream(new ByteArrayInputStream(bufferedFile));) 
		{
			//System.out.println(buffInputStream.available());
				int c;
//				while((c=buffInputStream.read())!=-1)
//				{
//					System.out.print((char)c);
//				}
			
//			byte[] buffData=new byte[buffInputStream.available()];
//			buffInputStream.read(buffData,2,7);
//			System.out.println(buffData);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found " + e.getMessage());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("I/O Error " + e1.getMessage());
		}

	}

}
