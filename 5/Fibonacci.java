//to print the fibonacci series upto 100.

import java.util.*;
public class Fibonacci{

	public static void main(String args[]){
	
		int num1=0;
		int num2=1;
		
		System.out.println("First 10 numbers in the fibonacci series are:");
		System.out.println(num1);
		System.out.println(num2);
		
		for(int i=0;i<=7;i++){
		
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
		}
	}
}


