package string;

public class NoOfRepeatedCharacters {

	public static void main(String[] args) {
		
		String s1="aabbcada";
		char ch[]=s1.toCharArray();
		int n=ch.length;
		for(int i=0; i<n; i++) {
			int count=0;
			for(int j=i+1; j<n; j++) {
				if(ch[i]==ch[j]) {
					count++;
					for(int k=j;k<n-1;k++) {
						ch[k]=ch[k+1];  
					}
					n--;
					j--;
					
	
				}
				
			}
			System.out.println(ch[i]+" is repeated "+ count+" times");
		}
		

	}

}
