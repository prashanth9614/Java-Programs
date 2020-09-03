package string;

public class Lower_and_UpperCase {

	public static String lowerCase(String s1) {
		
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]>=65 && ch[i]<=90) {
				ch[i]=(char)(ch[i]+32);
			}
		}
		
		return new String(ch);
	}
	
	public static String upperCase(String s2) {
		
		char ch[]=s2.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]>=97 && ch[i]<=122) {
				ch[i]=(char)(ch[i]-32);
			}
		}
		
		return new String(ch);
	}
	
	public static void main(String[] args) {
		
		String s1="PRogrAM";
		
		String ans=lowerCase(s1);
		System.out.println(ans);
		String s2="prOGRam";
		String ans2=upperCase(s2);
		System.out.println(ans2);
	}
}
