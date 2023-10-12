import java.util.*;

public class Armstrong{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n,ogn,ld,sum=0,nd=0;                                  //ogn=original number, ld=last digit, nd=total number of digits

		System.out.print("Enter any number: ");
		n=sc.nextInt();
		
		ogn=n;

		while(n>0){        //this while loop is used to count total number of digits.

			n=n/10;
			nd=nd+1;
		}

		n=ogn;

		while(n>0){

			ld=n%10;
			sum=sum+(int)Math.pow(ld,nd);      //Math.pow can only be used on double, not int. So we cast the variable sum (int)
			n=n/10;
		}


		if(ogn==sum){
			System.out.println(ogn+" is an armstrong number!");
		}

		else{
			System.out.println(ogn+" is not an armstrong number!");
		}

	}
}







