// create student marklist containing 5 subjects.

import java.util.*;
public class Marks{

	public static void main(String args[]){
	
		Scanner sc=new Scanner(System.in);
	
		System.out.print("Enter the marks scored for subject 1: ");
		int m1=sc.nextInt();
		System.out.print("Enter the marks scored for subject 2: ");
		int m2=sc.nextInt();
		System.out.print("Enter the marks scored for subject 3: ");
		int m3=sc.nextInt();
		System.out.print("Enter the marks scored for subject 4: ");
		int m4=sc.nextInt();
		System.out.print("Enter the marks scored for subject 5: ");
		int m5=sc.nextInt();
		
		System.out.println("Marks scored by the student in subject 1 = "+m1);
		System.out.println("Marks scored by the student in subject 2 = "+m2);
		System.out.println("Marks scored by the student in subject 3 = "+m3);
		System.out.println("Marks scored by the student in subject 4 = "+m4);
		System.out.println("Marks scored by the student in subject 5 = "+m5);

	}
}
