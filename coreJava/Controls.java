package coreJava;

import java.util.*;
import java.lang.*;

class Controls{
	public static void main (String args[])
	{
		 String rno="41248";
		 
		 switch(rno.charAt(0))
		 {
		 	case'1':
		 		System.out.println("First year Student");
		 		switch(rno.charAt(1))
		 		{
		 			case '1':
		 				System.out.println("Branch CE");
		 				break;
		 			case '2':
		 				System.out.println("Branch ECE");
		 				break;
		 			case '3':
		 				System.out.println("Branch IT");
		 				break;
		 		}
		 		break;
		 	case'2':
		 		System.out.println("Second year Student");
		 		switch(rno.charAt(1))
		 		{
		 			case '1':
		 				System.out.println("Branch CE");
		 				break;
		 			case '2':
		 				System.out.println("Branch ECE");
		 				break;
		 			case '3':
		 				System.out.println("Branch IT");
		 				break;
		 		}
		 		break;
		 	case '3':
		 		System.out.println("Third year Student");
		 		switch(rno.charAt(1))
		 		{
		 			case '1':
		 				System.out.println("Branch CE");
		 				break;
		 			case '2':
		 				System.out.println("Branch ECE");
		 				break;
		 			case '3':
		 				System.out.println("Branch IT");
		 				break;
		 		}
		 		break;
		 	case'4':
		 		System.out.println("Fourth year Student");
		 		switch(rno.charAt(1))
		 		{
		 			case '1':
		 				System.out.println("Branch CE");
		 				break;
		 			case '2':
		 				System.out.println("Branch ECE");
		 				break;
		 			case '3':
		 				System.out.println("Branch IT");
		 				break;
		 		}
		 		break;
		 	default:
		 		System.out.println("Invalid roll no format");
		 }
	}
}