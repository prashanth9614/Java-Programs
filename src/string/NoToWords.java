package string;

public class NoToWords {
	public static void display(int num,String str){
		String [] one={"","one","two","three","four","five",
				"six","seven","eight","nine","ten",
				"eleven","tweleve","thirteen","fourteen",
				"fifteen","sixteen","seventeen","eighteen",
				"nineteen"};

	String [] two={"","","twenty","thirty","fourty","fifty","sixty",
				"seventy","eighty","ninty"};	
	if(num>19){
	System.out.print(two[num/10]+" "+one[num%10]);
	}
	else
	{
		System.out.print(one[num]);
	}
	
	if(num!=0) {
		System.out.print(str);
	}
	
	}
	public static void main(String[] args)
	{
	int num=523456789;
	display(num/10000000," crore ");
	display((num/100000)%100," lakh ");
	display((num/1000)%100," Thousand ");
	display((num/100)%10," hundred ");
	display(num%100,"");
	}

}

/*Tracing
1.num=523456789;
	display(523456789/10000000=52," crore ");
	if(52>19) true 
	print(two[52/10]+" "+one[52%10]); //fifty two
	if(52!=0) true
	print(str); //crore
	//fifty two crore
	
	display((523456789/100000)%100=5234%100=34," lakh ");
	if(34>19) true 
	print(two[34/10]+" "+one[34%10]); //thirty four
	if(34!=0) true
	print(str); //lakh
	//fifty two crore thirty four lakh
	 
	display((523456789/1000)%100=523456%100=56," lakh ");
	if(56>19) true 
	print(two[56/10]+" "+one[56%10]); //fifty six 
	if(56!=0) true
	print(str); //thousand
	//fifty two crore thirty four lakh fifty six thousand 
	
	display((523456789/100)%10=5234567%10=7," hundred ");
	if(7>19) false 
	else ==> print(one[num]); // seven
	if(7!=0) true
	print(str); //hundred
	//fifty two crore thirty four lakh fifty six thousand seven hundred

	display((523456789/100)=89,"");
	if(89>19) true 
	print(two[89/10]+" "+one[89%10]); //eighty nine
	if(89!=0) true
	print(str); //""
	//fifty two crore thirty four lakh fifty six thousand seven hundred eighty nine
	
2.num=123456789;
	display(123456789/10000000=12," crore ");
	if(12>19) false
	else ==> print(one[num]); //twelve
	if(12!=0) true
	print(str); //crore
	//twelve crore
	
	display((123456789/100000)%100=1234%100=34," lakh ");
	if(34>19) true 
	print(two[34/10]+" "+one[34%10]); //thirty four
	if(34!=0) true
	print(str); //lakh
	//twelve crore thirty four lakh
	 
	display((123456789/1000)%100=123456%100=56," lakh ");
	if(56>19) true 
	print(two[56/10]+" "+one[56%10]); //fifty six 
	if(56!=0) true
	print(str); //thousand
	//twelve crore thirty four lakh fifty six thousand 
	
	display((123456789/100)%10=1234567%10=7," hundred ");
	if(7>19) false 
	else ==> print(one[num]); // seven
	if(7!=0) true
	print(str); //hundred
	//twelve crore thirty four lakh fifty six thousand seven hundred

	display((123456789/100)=89,"");
	if(89>19) true 
	print(two[89/10]+" "+one[89%10]); //eighty nine
	if(89!=0) true
	print(str); //""
	//twelve crore thirty four lakh fifty six thousand seven hundred eighty nine
	
	*/
