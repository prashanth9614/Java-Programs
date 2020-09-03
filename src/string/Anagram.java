package string;

public class Anagram {

	public static String removeSpaces(String s1) {
		
		char ch[]=s1.toCharArray();
		String out="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				out=out+ch[i];
			}
		}
		return out;
	}
	
	public static String lowerCase(String s1) {
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]>=65 && ch[i]<=90) {
				ch[i]=(char)(ch[i]+32);
			}
		}
		
		return new String(ch);
	}

	public static String sortString(String s1) {
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] =temp;
				}
			}
		}
		return new String(ch);
		
	}
	
	public static boolean compareString(String s1, String s2) {
		
	        
	        if(s1.length()!=s2.length())
	            return false;

	        
	        for (int i = 0; i <s1.length() ; i++) {
	            if(s1.charAt(i)!=s2.charAt(i))
	                return false;
	        }
	        
	        return true;
	    }
	
	
	public static void main(String[] args) {
		String s1="abc";
		String s2="abC";
	//String ans=	removeSpaces(s1);
	//String ans=	lowerCase(s1);
		//String ans=	sortString(s1);
		boolean ans =compareString(s1,s2);
		System.out.println(ans);
	}
}
