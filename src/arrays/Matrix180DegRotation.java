package arrays;

public class Matrix180DegRotation {
	
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
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0,k=ar.length-1;j<ar[i].length/2;j++,k--) {
				int temp = ar[i][j];
				ar[i][j] = ar[i][k];
				ar[i][k] =temp;
			}
		}
		
		for(int i=0,k=ar.length-1;i<ar.length/2;i++,k--) {
			for(int j=0;j<ar[i].length;j++) {
				int temp = ar[i][j];
				ar[i][j] = ar[k][j];
				ar[k][j] =temp;
			}
		}
		
		System.out.println("Matrix after 180 Degree  rotation ");
		System.out.println("The array elements are");
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
			
		}
		
}

}
