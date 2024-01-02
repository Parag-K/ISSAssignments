package coreJava;

import java.lang.*;
import java.util.*;

class Inheritance{
	static class ISS{
	
		private static ISS inst;
		private ISS()
		{
			
		}
		
		public static ISS getInstance()
		{
			if(inst==null)
				inst=new ISS();
			return inst;
			
		}
		
	}
	
	class Employee extends ISS{
		
	}
	public static void main(String args[])
	{
		
	}
}