package string;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="malayalam";
		String ans="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			ans = ans +s1.charAt(i);
		}
		System.out.println(ans);
		
		String s2="java";
		String ans2="";
		char ch[]=s2.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			ans2=ans2 + ch[i];
		}
		System.out.println(ans2);
		
		String s3="jar";
		char ch2[]=s3.toCharArray();
		for(int i=0,j=ch2.length-1;i<ch2.length/2;i++,j--) {
			char temp = ch2[i];
			ch2[i] = ch2[j];
			ch2[j] =temp;
		}
		String ans3 = new String(ch2);
		System.out.println(ans3);
		}
	}


