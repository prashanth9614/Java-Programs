package arrays;

public class ReverseElements {

	public static void main(String[] args) {
		
		int ar[]= {10, 20, 30, 40, 50};
		
	    /*for(int i=0; i<ar.length/2; i++) {
			
			int temp =ar[i];
			ar[i]=ar[ar.length-1-i];
			ar[ar.length-1-i]=temp;
		}*/
		
		for(int i=0,j=ar.length-1;i<ar.length/2;i++,j--) {
			int temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
		}
		
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		
	}
}
