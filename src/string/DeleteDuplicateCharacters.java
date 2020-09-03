package string;

public class DeleteDuplicateCharacters {
	public static void main(String[] args) {
		
		String s1="aabbcada";
		char ch[]=s1.toCharArray();
		int n=ch.length;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(ch[i]==ch[j]) {
					for(int k=j;k<n-1;k++) {
						ch[k]=ch[k+1];  
					}
					n--;
					j--;
					
	
				}
				
			}
		}
		char nch[]= new char[n];
		for(int i=0;i<n;i++) {
			nch[i]=ch[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(nch[i]);
			
		}

	}


}
