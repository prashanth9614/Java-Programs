package arrays;

public class ReverseColoumn2d {
public static void main(String[] args) {
		
		int ar[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0,k=ar.length-1;i<ar.length/2;i++,k--) {
			for(int j=0;j<ar[i].length;j++) {
				int temp = ar[i][j];
				ar[i][j] = ar[k][j];
				ar[k][j] =temp;
			}
		}
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
			
		}
	}

}
