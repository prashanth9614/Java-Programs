package string;

public class Reverse_Whole_Word_In_a_Sentence {
	
	public static void main(String[] args){
        String out="";
		String s1 = "this is string";
		char ch[] = s1.toCharArray();
		for(int i=ch.length-1; i>=0;i--) {
			String temp="";
			while( i>=0  && ch[i]!=' ') {
				temp= ch[i] + temp    ;
				i--;
			}
			out=out+temp+" ";
		}
		System.out.print(out);
	}

}
/*Tracing
 s1="this is string";
 for(i=13; 13>=0) true 
 ==> temp=""; 
 ==> while(13>=0 && g!=' ') true==> temp='g'+""="g" ==> i=12;
 ==> while(12>=0 && n!=' ') true==> temp='n'+"g"="ng" ==> i=11;
 ==> while(11>=0 && i!=' ') true==> temp='i'+"ng"="ing" ==> i=10;
 ==> while(10>=0 && r!=' ') true==> temp='r'+"ing"="ring" ==> i=9;
 ==> while(9>=0 && t!=' ') true==> temp='t'+"ring"="tring" ==> i=8;
 ==> while(8>=0 && s!=' ') true==> temp='s'+"tring"="string" ==> i=7;
 ==> while(7>=0 && ' '!=' ') false==> out = ""+"string"+" "="string "
 for(i=6; 6>=0) true
 ==> temp="";
 ==> while(6>=0 && s!=' ') true==> temp='s'+""="s" ==> i=5;
 ==> while(5>=0 && i!=' ') true==> temp='i'+"s"="is"==> i=4;
 ==> while(4>=0 && ' '!=' ') false==> out = "string "+"is"+" "="string is ";
 for(i=3; 3>=0) true
 ==> temp="";
 ==> while(3>=0 && s!=' ') true==> temp='s'+""="s" ==> i=2;
 ==> while(2>=0 && i!=' ') true==> temp='i'+"s"="is" ==> i=1;
 ==> while(1>=0 && h!=' ') true==> temp='h'+"is"="his" ==> i=0;
 ==> while(0>=0 && t!=' ') true==> temp='t'+"his"="this" ==> i=-1;
 ==> while(-1>=0) false==> out="string is "+"this"+" "="string is this ";
 for(14<14) false
 
 */
