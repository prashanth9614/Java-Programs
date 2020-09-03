package string;

public class Reverse_Every_Alternate_Word_In_a_Sentence{
	
	public static void main(String[] args){
		String out="";
		String s1 = "java is a programming language";
		char ch[] = s1.toCharArray();
		int count=0;
		for(int i=0; i<ch.length;i++) {
			String temp="";
			
			while( i<ch.length  && ch[i]!=' ') {
			
				if(count%2==0) {
					temp= temp + ch[i];
					i++;
				}else {
					temp= ch[i] + temp;
					i++;
				}
				
				
			}
			count++;
			out=out+temp+" ";
		}
		System.out.print(out);
		//output==>java si a gnimmargorp language 
	}

}
