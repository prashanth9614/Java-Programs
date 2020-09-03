package numerical;

public class FibonacciSeries {

	
	public static void fib(int count) {
		
		int n1=0;
		int n2=1;
		
		for(int i=0; i<count; i++) {
			int sum=n1+n2;
			System.out.print(n1+ " ");
			n1=n2;
			n2=sum;
		}
	}
	
	
	public static void main(String[] args) {
		
		fib(10);
	}
}
