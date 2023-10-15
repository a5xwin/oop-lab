import java.util.*;

public class Palindrome{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter any string: ");
		String x =sc.nextLine().toLowerCase();

		int len=x.length();

		int i=0;
		int j=len-1;
		int count=0;


		while(i<j && count==0){

			if(x.charAt(i)!=(x.charAt(j))){
				count+=1;
			}
			i++;
			j--;
		}

		
		if(count!=0){
			System.out.println("Entered string is not palindrome!");
		}
		
		else{
			System.out.println("Entered string is palindrome!");
		}
	}		
}
