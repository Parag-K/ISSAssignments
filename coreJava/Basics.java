package coreJava;

import java.lang.*;
import java.util.*;

class Basics{
	static class Demo{
		static int runCount=1;
		String s="The demo has been shown "+ runCount +" times";
		Demo()
		{
			++runCount;
			System.out.println(s);
		}
		public void setCount(int c)
		{
			runCount=c;
		}
	}
	public static void main(String args[])
	{
		for(int i=0;i<8;i++)
		{
			Demo d= new Demo();
		}
		Demo d= new Demo();
		d.setCount(100);
		for(int i=0;i<3;i++)
		{
			Demo d1= new Demo();
		}
	}
}