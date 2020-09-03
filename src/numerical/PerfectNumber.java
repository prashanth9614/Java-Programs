package numerical;

public class PerfectNumber {
	
	public static boolean isPerfect(int no) {
		int sum=0;
		for(int i=1;i<no; i++) {
			if(no % i ==0) {
				sum = sum +i; 
			}
		}
		if(sum==no) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		for(int i=1;i<1000;i++) {
			boolean ans=isPerfect(i);
			if(ans) {
				System.out.println(i);
			}
		}
	}
	/*public static void main(String[] args) {
		
		int no=6;
		boolean ans = isPerfect(no);
		if(ans) {
			System.out.println(no+" is a perfect number");
		}else {
			System.out.println(no+" is not a perfect number");
		}
	}*/
	
	
	
	
	
	
	
	
	

}
