package numerical;

public class StrongNumber {

	
	public static int isFact(int rem) {
		int out=1;
		for(int i=rem;i>1;i--) {
			out = out * i;
		}
		return out;
		
	}
	
	
	
	public static boolean isStrong(int no) {
		int sum=0;
		int temp=no;
		while(no!=0) {
			int rem= no%10;
			int factres=isFact(rem);
			sum = sum+factres;
			no=no/10;
		}
		return sum==temp;
	}
	
	
	
	public static void main(String[] args) {
		int no = 145;
		boolean ans = isStrong(no);
		String res= ans==true?" is a strong number":" is not a strong number";
		System.out.println(no+" "+res);
	}
}
