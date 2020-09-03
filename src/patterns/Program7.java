package patterns;

public class Program7 {

	public static void main(String[] args) {
		int n=3;
		// loop to decide no of rows
		for(int row=0; row<n; row++ ) {
			//col==spaces+stars
			//loop to decide no of spaces
			for(int spaces=0; spaces<n-1-row; spaces++) {
					System.out.print("  ");
				
			}
			//loop to decide no of stars
			for(int stars=0; 2*row>=stars; stars++ ) {
					System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}