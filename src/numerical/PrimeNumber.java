package numerical;

public class PrimeNumber {
	
	public static boolean isPrime(int no) {
		if(no<=1) {
			return false;
		}
		for(int i=2;i<no; i++) {
			if(no % i ==0) {
				return false; 
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		for(int i=1;i<1000;i++) {
			boolean ans=isPrime(i);
			if(ans) {
				System.out.println(i);
			}
		}
	}
	/*public static void main(String[] args) {
		
		int no=6;
		boolean ans = isPrime(no);
		if(ans) {
			System.out.println(no+" is a prime number");
		}else {
			System.out.println(no+" is not a prime number");
		}
	}*/
	

}
