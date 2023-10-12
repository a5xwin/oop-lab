import java.util.*;

public class Matrixadd{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int r,c;

		System.out.print("Enter number of rows of the matrix: ");
		r=sc.nextInt();
		System.out.print("Enter number of columns of the matrix: ");
		c=sc.nextInt(); 

		int arr[][]=new int[r][c];
		int brr[][]=new int[r][c];
		int crr[][]=new int[r][c];
		

		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print("Enter the element at"+" row: "+(i+1)+" column: "+(j+1)+" of the first matrix: ");
				arr[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print("Enter the element at"+" row: "+(i+1)+" column: "+(j+1)+" of the second matrix: ");
				brr[i][j]=sc.nextInt();
			}
		}


		System.out.println("First Matrix: ");

		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print((arr[i][j])+" ");
			}
			System.out.printf("\n");
		}

		System.out.println("Second Matrix: ");

		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print((brr[i][j])+" ");
			}
			System.out.printf("\n");
		}



		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				crr[i][j]=arr[i][j]+brr[i][j];
			}
		}

		System.out.println("Resultant Matrix: ");

		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print((crr[i][j])+" ");
			}
			System.out.printf("\n");
		}
	}
}
	
