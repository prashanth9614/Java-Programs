package arrays;

public class ReverseRow2d {

	public static void main(String[] args) {
		
		int ar[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0,k=ar[i].length-1;j<ar[i].length/2;j++,k--) {
				int temp = ar[i][j];
				ar[i][j] = ar[i][k];
				ar[i][k] =temp;
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
