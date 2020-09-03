package arrays;

public class DeleteElements {

	public static void main(String[] args) {

		int ar[]= {14,25,34,6,25};
		int position=2;
		int nar[]= new int[ar.length-1];
		
	
		for(int i=0; i<position-1; i++) {
			nar[i]=ar[i];
		}
		for(int i=position-1; i<nar.length; i++) {
			nar[i]= ar[i+1];
		}
		
		for(int i=0; i<nar.length; i++) {
			System.out.println(nar[i]);
		}	
		
	}
		
}
/*Tracing
 {14, 25, 34, 6, 25}
 position=2;
 
 for(i=0; 0<1; i++) true
   nar[0]= ar[0];
   // 14
 for(i=1; 1<1; i++) end of 1st for loop
 
 for(i=1; 1<4;i++) true
 	nar[1]= ar[2];
 	// 14 34
 
 for(i=2; 2<4;i++) true
 	nar[2]= ar[3];
 	// 14 34 6
 
 for(i=3; 3<4;i++) true
 	nar[3]= ar[4];
 	// 14 34 6 25
 
 for(i=4; 4<4;i++) false end of 2nd for loop
 	
 */


