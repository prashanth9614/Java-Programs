package arrays;

public class Matrix90DegLeft {
	
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
		
		for(int i=0,k=tar.length-1;i<tar.length/2;i++,k--) {
			for(int j=0;j<tar[i].length;j++) {
				int temp = tar[i][j];
				tar[i][j] = tar[k][j];
				tar[k][j] =temp;
			}
		}
		System.out.println("Matrix after 90 Degree left rotation ");
		System.out.println("The array elements are");
		for(int i=0;i<tar.length;i++) {
			for(int j=0;j<tar[i].length;j++) {
				System.out.print(tar[i][j]+" ");
			}
			System.out.println();
			
		}
		
}

}
