package prog;

public class Prog1 {
	
	int a = 10;
	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(s);
		
		String rev = "";
		int len = s.length();
		
		for(int i=len-1; i>=0; i--) {
			rev = rev + s.charAt(i);
			
			
		}
		System.out.println(rev);
		Prog1 ref = new Prog1();
		System.out.println(ref.a);
	}
}
