package arrays;

public class DeleteDuplicateElements {
	
	public static void main(String[] args) {
	
		int ar[]={3, 3, 3, 2, 1, 2};
		int n=ar.length;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(ar[i]==ar[j]) {
					for(int k=j;k<n-1;k++) {
						ar[k]=ar[k+1];  
					}
					n--;
					j--;
					
	
				}
				
			}
		}
		int nar[]= new int[5];
		for(int i=0;i<n;i++) {
			nar[i]=ar[i];
		}
		for(int i=0;i<n;i++) {
			System.out.println(nar[i]);
			
		}

	}

}
