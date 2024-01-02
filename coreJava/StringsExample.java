package coreJava;
 
import java.lang.*;
import java.util.*;

class StringExamples{
	
	public static void main(String args[])
	{
		//string class
		 String s="hello";
		 String s1= new String("world");
		 
		 String s2=s+s1;
		 
		 String s3="Hello World";
		 
		 String s4="hello world";
		 
		 System.out.println(s2.equals(s3));
		 System.out.println(s2.equalsIgnoreCase(s3));
		 System.out.println(s3.equalsIgnoreCase(s4));
		 
		 
		 String s5 = new String(s);
		 System.out.println(s + " equals " + s5 + " -> " + s.equals(s5));
		 System.out.println(s + " == " + s5 + " -> " + (s == s5));
		 
		//stringbuffer
		 
		 StringBuffer sb = new StringBuffer("PICT");
		 System.out.println("buffer = " + sb);
		 System.out.println("length = " + sb.length());
		 System.out.println("capacity = " + sb.capacity());
		 sb.setCharAt(1, 'o');
		 sb.setLength(2);
		 System.out.println("buffer after = " + sb);
		 System.out.println("charAt(1) after = " + sb.charAt(1));
		 
		

	}
}