//list out 1st n numbers and find their sum.

import java.util.*;
public class Nsum{

	public static void main(String args[]){
	
		Scanner sc=new Scanner(System.in);
	
		System.out.print("Enter any number: ");
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=0;i<=n;i++){
			sum=sum+i;
		}
		
		System.out.println("Sum of numbers upto "+n+" = "+sum);
	}
}


