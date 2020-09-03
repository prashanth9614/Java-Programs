package numerical;

public class ArmstrongNumber {
	
	public static int noOfDig(int no) {
		int n=0;
		while(no!=0) {
			no=no/10;
			n++;
		}
		return n;
		
	}
	
	public static int power(int n1, int pwr) {
		int out=1;
		
		for(int i=0; i<pwr; i++) {
		    out =out*n1;	
		}
		return out;
		
	}
	
	public static boolean isArmstrong(int no) {
		int temp =no;
		int res=0;
	
		while(no!=0) {
			int rem=no%10;
			int n=noOfDig(temp);
		    res = res + power(rem,n);
			no=no/10;
			
		}
	
		return temp==res;
		
	}

	public static void main(String[] args) {
		int no = 1634;
		boolean ans = isArmstrong(no);
		if(ans) {
			System.out.println(no+" is a Armstrong number");
		}else {
			System.out.println(no+" is not a Armstrong number");
		}
	}
}
