package string;

public class StringReplace {
	
	public static void main(String[] args) {
		String out="";
		String s1="amit works in accolite and accolite is good";
		String s2="works";
		String s3="accolite";
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		char ch3[] = s3.toCharArray();
		for(int i=0; i<ch1.length;i++) {
			String temp="";
			while( i<ch1.length  && ch1[i]!=' ') {
				temp= temp + ch1[i];
				i++;
				if(temp.equals(s2)) {
					temp="";
					for(int index=0; index<ch3.length; index++) {
						temp=temp+ch3[index];
					}
				}else if(temp.equals(s3)) {
					temp="";
					for(int index=0; index<ch2.length; index++) {
						temp=temp+ch2[index];
					
					}
				}
				
			}
			out=out+temp+" ";
		}
		System.out.print(out);
		
		//output==>"amit accolite in works and works is good"
	}

	}


