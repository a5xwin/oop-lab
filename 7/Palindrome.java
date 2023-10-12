import java.util.*;

public class Palindrome{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n,ogn,ld,sum=0;                                  //ogn=original number, ld=last digit

		System.out.print("Enter any number: ");
		n=sc.nextInt();
		
		ogn=n;

		while(n>0){
			ld=n%10;
			sum=(sum*10)+ld;
			n=n/10;
		}

		if(ogn==sum){
			System.out.println(ogn+" is a palindrome number!");
		}

		else{
			System.out.println(ogn+" is not a palindrome number!");
		}

	}
}
	
  
