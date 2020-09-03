package arrays;

public class ReplaceElements {

	public static void main(String[] args) {
		

		int ar[]= {12, 15, 21, 24, 27, 30};
		int element=16;
		int position=3;
		int nar[]= new int[ar.length];
		
		nar[position-1]= element;
		for(int i=0; i<position-1; i++) {
			nar[i]=ar[i];
		}
		for(int i=position; i<nar.length; i++) {
			nar[i]= ar[i];
		}
		
		for(int i=0; i<nar.length; i++) {
			System.out.println(nar[i]);
		}
		
	
	}
}
