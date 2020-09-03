package string;

public class Count_Characters_Of_Words_in_a_Sentence {
	public static void main(String[] args){
		String out="";
		String s1 = "this is string";
		char ch[] = s1.toCharArray();
		for(int i=0; i<ch.length;i++) {
			String temp="";
			int count=0;
			while( i<ch.length  && ch[i]!=' ') {
				temp= temp + ch[i];
				i++;
				count++;
			}
			out=out+temp+count;
		}
		System.out.print(out);
	}

}
/*Tracing
s1="this is string";
 for(i=0; 0<22) true 
 ==> temp=""; 
 ==> count=0;
 ==> while(0<14 && t!=' ') true==> temp=""+'t'="t" ==> i=1; ==> count=1
 ==> while(1<14 && h!=' ') true==> temp="t"+'h'="th" ==> i=2;==> count=2
 ==> while(2<14 && i!=' ') true==> temp="th"+'i'="thi" ==> i=3;==> count=3
 ==> while(3<14 && s!=' ') true==> temp="thi"+'s'="this" ==> i=4;==> count=4
 ==> while(4<14 && ' '!=' ') false==> out = ""+"this"+4="this4"
 for(i=5; 5<14) true
 ==> temp="";
 ==> count=0;
 ==> while(5<14 && i!=' ') true==> temp=""+'i'="i" ==> i=6;==> count=1
 ==> while(6<14 && s!=' ') true==> temp="i"+'s'="is"==> i=7;==> count=2
 ==> while(7<14 && ' '!=' ') false==> out = "this4"+"is"+2="this4is2";
 for(i=8; 8<14) true
 ==> temp="";
 ==> count=0;
 ==> while(8<14 && s!=' ') true==> temp=""+'s'="s" ==> i=9;==> count=1
 ==> while(9<14 && t!=' ') true==> temp="s"+'t'="st" ==> i=10;==> count=2
 ==> while(10<14 && r!=' ') true==> temp="st"+'r'="str" ==> i=11;==> count=3
 ==> while(11<14 && i!=' ') true==> temp="str"+'i'="stri" ==> i=12;==> count=4
 ==> while(12<14 && n!=' ') true==> temp="stri"+'n'="strin" ==> i=13;==> count=5
 ==> while(13<14 && g!=' ') true==> temp="strin"+'g'="string" ==> i=14;==> count=6
 ==> while(14<14) false==> out="this4is2"+"string"+6="this4is2string6";
 for(14<14) false
*/