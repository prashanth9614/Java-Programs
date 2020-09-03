package numerical;

public class ReverseNumber {
	
	public static int reverse(int no) {
		int res=0;
		while(no!=0) {
			int rem= no%10;
		    res = res*10+rem;
		    no=no/10;
		}
		return res;
		
	}
	
	public static void main(String[] args) {
		int no=123;
		int ans= reverse(no);
		
		System.out.println(ans);
	}

}
