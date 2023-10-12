import java.util.*;

public class Freq{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any string: ");
		String x;
		x=sc.nextLine();
		
		System.out.print("Enter character to search: ");
		char s;
		s=sc.next().charAt(0);

		int n,count=0;
		n=x.length();
		
		for(int i=0;i<n;i++){
			if(x.charAt(i)==s){
				count=count+1;
			}
		}

		System.out.println(s+" was found "+count+" times!");

	}
}
	
