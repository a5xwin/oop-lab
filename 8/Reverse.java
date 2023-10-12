import java.util.*;

public class Reverse{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n,ld,sum=0;                                  //ld=last digit

		System.out.print("Enter any number: ");
		n=sc.nextInt();

		while(n>0){
			ld=n%10;
			sum=(sum*10)+ld;
			n=n/10;
		}
		
		System.out.println("The reversed number is: "+sum);

	}
}
	
