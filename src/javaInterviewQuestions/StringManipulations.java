  package javaInterviewQuestions;

import java.util.Arrays;

public class StringManipulations {

	public static void main(String[] args) {
		String str = "The rains have started here selenium";
		String str1 = "The rains have started here Selenium";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s')); // first occurance of s
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1)); // Second Occurance of s
		
		System.out.println(str.indexOf('s', str.indexOf('s', str.indexOf('s', str.indexOf('s')+1))+1)); //Third Occurance of s
		
		System.out.println(str.indexOf("have")); // first occurance of have
		
		System.out.println(str.indexOf("Hello")); //if it not present then it will return -1. it will not throw any exception
		
		//String Comparision
		
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		//subString
		
		System.out.println(str.substring(0, 8));
		
		String s = "   Hello World   ";
		
		System.out.println(s.trim());
		System.out.println(s.replace('H', 'h'));
		System.out.println(s.replaceAll(" ", ""));
		
		String date = "01/02/1990";
		System.out.println(date.replace("/", "-"));
		
		//Split
		String test = "Hello_World_Test_Selenium";
		String testVal[] = test.split("_");
		System.out.println(Arrays.toString(testVal));
		
		for(int i=0; i<testVal.length; i++) {
			System.out.println(testVal[i]);
		}
		
		String s2 = "Care";
		System.out.println(s2.concat("s"));
		
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		
		System.out.println(x+y);
		System.out.println(x+y+a+b);//HelloWorld100200
		System.out.println(a+b+x+y);//300HelloWorld
		System.out.println(x+y+(a+b)); //HelloWorld300
		
		//String can be concatenate with any type int, long , double, float etc
		

	}

}
