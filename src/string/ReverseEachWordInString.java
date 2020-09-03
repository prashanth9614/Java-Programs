package string;

public class ReverseEachWordInString {
	
	public static void main(String[] args){
		String out ="";
		String s1 = "this is string"
				+ "";
		char ch[] = s1.toCharArray();
		for(int i=0; i<ch.length;i++) {
			String temp="";
			while( i<ch.length  && ch[i]!=' ') {
				temp=ch[i] + temp;
				i++;
			}
			out=out+temp+" ";
		}
		System.out.print(out);
	}
}
/*Tracing
 s1= "string reverse program"
 for(i=0; 0<22) true 
 ==> temp=""; 
 ==> while(0<22 && s!=' ') true==> temp='s'+""="s" ==> i=1;
 ==> while(1<22 && t!=' ') true==> temp='t'+"s"="ts" ==> i=2;
 ==> while(2<22 && r!=' ') true==> temp='r'+"ts"="rts" ==> i=3;
 ==> while(3<22 && i!=' ') true==> temp='i'+"rts"="irts" ==> i=4;
 ==> while(4<22 && n!=' ') true==> temp='n'+"irts"="nirts" ==> i=5;
 ==> while(5<22 && g!=' ') true==> temp='g'+"nirts"="gnirts" ==> i=6;
 ==> while(6<22 && ' ' !=' ') false ==> out = ""+"gnirts"+" " ==>"gnirts "
 for(i=7; 7<22) true
 ==> temp="";
 ==> while(7<22 && r!=' ') true==> temp='r'+""="r" ==> i=8;
 ==> while(8<22 && e!=' ') true==> temp='e'+"r"="er" ==> i=9;
 ==> while(9<22 && v!=' ') true==> temp='v'+"er"="ver" ==> i=10;
 ==> while(10<22 && e!=' ') true==> temp='e'+"ver"="ever" ==> i=11;
 ==> while(11<22 && r!=' ') true==> temp='r'+"ever"="rever" ==> i=12;
 ==> while(12<22 && s!=' ') true==> temp='s'+"rever"="srever" ==> i=13;
 ==> while(13<22 && e!=' ') true==> temp='e'+"srever"="esrever" ==> i=14;
 ==> while(14<22 && ' '!=' ') false ==> out = "gnirts "+"esrever"+" " = "gnirts esrever " 
 for(i=15; 15<22) true
 ==> temp="";
 ==> while(15<22 && p!=' ') true==> temp='p'+""="p" ==> i=16;
 ==> while(16<22 && r!=' ') true==> temp='r'+"p"="rp" ==> i=17;
 ==> while(17<22 && o!=' ') true==> temp='o'+"rp"="orp" ==> i=18;
 ==> while(18<22 && g!=' ') true==> temp='g'+"orp"="gorp" ==> i=19;
 ==> while(19<22 && r!=' ') true==> temp='r'+"gorp"="rgorp" ==> i=20;
 ==> while(20<22 && a!=' ') true==> temp='a'+"rgorp"="argorp" ==> i=21;
 ==> while(21<22 && m!=' ') true==> temp='m'+"argorp"="margorp" ==> i=22;
 ==> while(22<22 ) false ==> out = "gnirts esrever "+"margorp"+" "= "gnirts esrever margorp "
 for(i=23; 23<22) false
 -----------------------------------------------------------------------------------------------------
 
 s2="this is a java program";
 for(i=0; 0<22) true 
 ==> temp=""; 
 ==> while(0<22 && t!=' ') true==> temp='t'+""="t" ==> i=1;
 ==> while(1<22 && h!=' ') true==> temp='h'+"t"="ht" ==> i=2;
 ==> while(2<22 && i!=' ') true==> temp='i'+"ht"="iht" ==> i=3;
 ==> while(3<22 && s!=' ') true==> temp='s'+"iht"="siht" ==> i=4;
 ==> while(4<22 && ' '!=' ') false==> out = ""+"siht"+" "="siht "
 for(i=5; 5<22) true
 ==> temp="";
 ==> while(5<22 && i!=' ') true==> temp='i'+""="i" ==> i=6;
 ==> while(6<22 && s!=' ') true==> temp='s'+"i"="si"==> i=7;
 ==> while(7<22 && ' '!=' ') false==> out = "siht "+"si"+" "="siht si ";
 for(i=8; 8<22) true
 ==> temp="";
 ==> while(8<22 && a!=' ') true ==> temp= 'a'+"" = "a" ==>i=9;
 ==> while(9<22 && ' '=' ') false==> out = "siht si "+"a"+" "="siht si a ";
 for(i=10; 10<22) true
 ==> temp="";
 ==> while(10<22 && j!=' ') true==> temp='j'+""="j" ==> i=11;
 ==> while(11<22 && a!=' ') true==> temp='a'+"j"="aj" ==> i=12;
 ==> while(12<22 && v!=' ') true==> temp='v'+"aj"="vaj" ==> i=13;
 ==> while(13<22 && a!=' ') true==> temp='a'+"vaj"="avaj" ==> i=14;
 ==> while(14<22 && ' '!=' ') false ==> out = "siht si a "+"avaj"+" "="siht si a avaj "
  for(i=15; 15<22) true
 ==> temp="";
 ==> while(15<22 && p!=' ') true==> temp='p'+""="p" ==> i=16;
 ==> while(16<22 && r!=' ') true==> temp='r'+"p"="rp" ==> i=17;
 ==> while(17<22 && o!=' ') true==> temp='o'+"rp"="orp" ==> i=18;
 ==> while(18<22 && g!=' ') true==> temp='g'+"orp"="gorp" ==> i=19;
 ==> while(19<22 && r!=' ') true==> temp='r'+"gorp"="rgorp" ==> i=20;
 ==> while(20<22 && a!=' ') true==> temp='a'+"rgorp"="argorp" ==> i=21;
 ==> while(21<22 && m!=' ') true==> temp='m'+"argorp"="margorp" ==> i=22;
 ==> while(22<22 ) false ==> out = "siht si a avaj "+"margorp"+" "= "siht si a avaj margorp "
 for(i=23; 23<22) false
 -------------------------------------------------------------------------------------------------------
 s1="this is string";
 for(i=0; 0<22) true 
 ==> temp=""; 
 ==> while(0<14 && t!=' ') true==> temp='t'+""="t" ==> i=1;
 ==> while(1<14 && h!=' ') true==> temp='h'+"t"="ht" ==> i=2;
 ==> while(2<14 && i!=' ') true==> temp='i'+"ht"="iht" ==> i=3;
 ==> while(3<14 && s!=' ') true==> temp='s'+"iht"="siht" ==> i=4;
 ==> while(4<14 && ' '!=' ') false==> out = ""+"siht"+" "="siht "
 for(i=5; 5<14) true
 ==> temp="";
 ==> while(5<14 && i!=' ') true==> temp='i'+""="i" ==> i=6;
 ==> while(6<14 && s!=' ') true==> temp='s'+"i"="si"==> i=7;
 ==> while(7<14 && ' '!=' ') false==> out = "siht "+"si"+" "="siht si ";
 for(i=8; 8<14) true
 ==> temp="";
 ==> while(8<14 && s!=' ') true==> temp='s'+""="s" ==> i=9;
 ==> while(9<14 && t!=' ') true==> temp='t'+"s"="ts" ==> i=10;
 ==> while(10<14 && r!=' ') true==> temp='r'+"ts"="rts" ==> i=11;
 ==> while(11<14 && i!=' ') true==> temp='i'+"rts"="irts" ==> i=12;
 ==> while(12<14 && n!=' ') true==> temp='n'+"irts"="nirts" ==> i=13;
 ==> while(13<14 && g!=' ') true==> temp='g'+"nirts"="gnirts" ==> i=14;
 ==> while(14<14) false==> out="siht si "+"gnirts"+" "="siht si gnirts ";
 for(14<14) false
-------------------------------------------------------------------------------------------------------
*/