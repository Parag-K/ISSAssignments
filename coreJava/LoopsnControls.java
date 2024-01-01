package coreJava;

import java.lang.*;
import java.util.*;

class LoopsnControls{
	 public static void main(String args[])
	 {
		 Boolean [] barray= {true,false,true,true,false,true};
		 int rightchoice=0,wrongchoice=0;
		 for(Boolean decision: barray)
		 {
			int b=(decision==true)?rightchoice++:wrongchoice++;
			
			if(decision)
				System.out.println("A right choice -> "+b);
			else
				System.out.println("Must Reconsider -> "+b);
			

		 }
		 System.out.println("No. of Right choices : "+rightchoice);
		 System.out.println("No. of Wrong choices : "+wrongchoice);
		 
		 
		 }
	 
}