package com.learning.patternmatcherdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemo {

	public static void main(String[] args) {
//		Pattern pattern=Pattern.compile("hello");
//		Matcher matcher=pattern.matcher("H\hello");	
//		if(matcher.matches())
//		{
//			System.out.println("String matched");
//		}
//		else
//		{
//			System.out.println("String does not match");
//		}
		
		//Pattern class methods
//		String s1="Sample";
//		Pattern pattern=Pattern.compile(s1);
//		String s2=pattern.pattern();
//		System.out.println(s2);
		
//		String values="One:Two:Three";
//		Pattern pattern=Pattern.compile(":");
//		String [] valuesArr=pattern.split(values,3);
//		for(String val:valuesArr)
//		{
//			System.out.println(val);
//		}
		
		//Matcher class methods
		
		//remaining character sequence after last match is truncated in appendReplacement
//		Pattern pattern=Pattern.compile("John");
//		Matcher matcher=pattern.matcher("John does this,and John does that");
//		StringBuffer s3=new StringBuffer();
//		while(matcher.find())
//		{
//			matcher.appendReplacement(s3, "Sam");
//			System.out.println(s3.toString());
//		}
		
		//remaining character sequence after last match is appended in appendTail
//		Pattern pattern=Pattern.compile("John");
//		Matcher matcher=pattern.matcher("John does this,and John does that");
//		StringBuffer s4=new StringBuffer();
//		while(matcher.find())
//		{
//			matcher.appendReplacement(s4, "Sam");
//			System.out.println(s4.toString());
//		}
//		matcher.appendTail(s4);
//		System.out.println(s4.toString());
		
//		Pattern pattern=Pattern.compile("John");
//		Matcher matcher=pattern.matcher("John does this,and John does that");
//		String s5=matcher.replaceAll("Sam");
//		System.out.println(s5);
		
//		Pattern pattern=Pattern.compile("John");
//		Matcher matcher=pattern.matcher("John does this,and John does that");
//		String s5=matcher.replaceFirst("Sam");
//		System.out.println(s5);
		
		
//		Pattern pattern=Pattern.compile("t");
//		Matcher matcher=pattern.matcher("John does this,and John does that");
//		while(matcher.find())
//		{
//		//matching index of given pattern from beginning of the string
//			System.out.println("Match found at: "+matcher.start(0));
//		}
		
//		Pattern pattern=Pattern.compile("t");
//		Matcher matcher=pattern.matcher("John does this,and John does that also");
//		while(matcher.find())
//		{
//			System.out.println("Match found at: "+matcher.end(0));
//		}

	}

}
