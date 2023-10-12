import java.util.*;

public class Matrixmulti{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int r1,c1,r2,c2;

		System.out.print("Enter the number of rows of matrix 1: ");
		r1=sc.nextInt();
		System.out.print("Enter the number of columns of matrix 1: ");
		c1=sc.nextInt(); 

		System.out.print("Enter the number of rows of matrix 2: ");
		r2=sc.nextInt();
		System.out.print("Enter the number of columns of matrix 2: ");
		c2=sc.nextInt();

		if(c1==r2){

			int arr[][]=new int[r1][c1];
			int brr[][]=new int[r2][c2];
			int crr[][]=new int[r1][c2];
		

			for(int i=0;i<r1;i++){
				for(int j=0;j<c1;j++){
					System.out.print("Enter the element at"+" row: "+(i+1)+" column: "+(j+1)+" of the first matrix: ");
					arr[i][j]=sc.nextInt();
				}
			}

			for(int i=0;i<r2;i++){
				for(int j=0;j<c2;j++){
					System.out.print("Enter the element at"+" row: "+(i+1)+" column: "+(j+1)+" of the second matrix: ");
					brr[i][j]=sc.nextInt();
				}
			}



			System.out.println("First Matrix: ");

			for(int i=0;i<r1;i++){
				for(int j=0;j<c1;j++){
					System.out.print((arr[i][j])+" ");
				}
				System.out.printf("\n");

			}


			System.out.println("Second Matrix: ");

			for(int i=0;i<r1;i++){
				for(int j=0;j<c1;j++){
					System.out.print((arr[i][j])+" ");
				}
				System.out.printf("\n");
			}


			for(int i=0;i<r1;i++){
				for(int j=0;j<c2;j++){
					crr[i][j]=0;
					for(int k=0;k<c2;k++){
						crr[i][j]+=arr[i][k]*brr[k][j];
					}
				}
			}

			System.out.println("Resultant Matrix: ");

			for(int i=0;i<r1;i++){
				for(int j=0;j<c2;j++){
					System.out.print((crr[i][j])+" ");
				}
				System.out.printf("\n");
			}

		}

		else{
			System.out.println("Matrix multiplication not possible!");
		}

	}
}
	
