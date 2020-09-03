package arrays;

public class Matrix90DegRight {
	
public static void main(String[] args) {
		
		int ar[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int row =ar.length;
		int coloumn= ar[0].length;
		
		System.out.println("size of input matrix is "+row+" x "+coloumn );
		System.out.println("The array elements are");
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.print(ar[i][j]+" ");
				}
			System.out.println();
		}
		int tar[][]= new int[coloumn][row];
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length;j++) {
				tar[i][j]=ar[j][i];
			}
		}
		
		System.out.println("size of transpose matrix is "+coloumn+" x "+row );
		System.out.println("The array elements are");
		for(int i=0; i<tar.length; i++) {
			for(int j=0; j<tar[i].length; j++) {
				System.out.print(tar[i][j]+" ");
				}
			System.out.println();
		}
		
		for(int i=0;i<tar.length;i++) {
			for(int j=0,k=tar.length-1;j<tar[i].length/2;j++,k--) {
				int temp = tar[i][j];
				tar[i][j] = tar[i][k];
				tar[i][k] =temp;
			}
		}
		System.out.println("Matrix after 90 Degree Right rotation ");
		System.out.println("The array elements are");
		for(int i=0;i<tar.length;i++) {
			for(int j=0;j<tar[i].length;j++) {
				System.out.print(tar[i][j]+" ");
			}
			System.out.println();
			
		}
		
}


}
