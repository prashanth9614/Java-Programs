package patterns;

public class Program1 
{
	public static void main(String[] args)
	{
		int n=4;	
		for(int rows=0;rows<n;rows++)
		{
			for(int col=0;col<n;col++)
			{
				if(rows==0||rows==n-1||col==0||col==n-1)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
		
	}
}
/* Tracing
	n=4;
	for(rows=0;0<4) true
	for(col=0;0<4) true
		if(0==0||0==3||0==0||0==3) true
		print("* "); // *
	print(" ");
    
	for(col=1;1<4) true
		if(0==0||0==3||1==0||1==3) true
		print("* "); // * * 
	print(" ");
	
	for(col=2;2<4) true
		if(0==0||0==3||2==0||2==3) true
		print("* "); // * * *
	print(" ");

	for(col=3;3<4) true
		if(0==0||0==3||3==0||3==3) true
		print("* "); // * * * *
	print(" ");
	
	for(col=4;4<4) false 
	increment row 

	for(rows=1;1<4) true
	for(col=0;0<4) true
		if(1==0||1==3||0==0||0==3) true
		print("* "); // * * * *
						*
	print(" ");

	for(rows=1;1<4) true
	for(col=1;1<4) true
		if(1==0||1==3||1==0||1==3) false
		print(" "); // * * * *
					   * 
	print(" ");
	
	for(rows=1;1<4) true
	for(col=2;2<4) true
		if(1==0||1==3||2==0||2==3) false
		print(" "); // * * * *
					   * 
	print(" ");
	
	for(rows=1;1<4) true
	for(col=3;3<4) true
		if(1==0||1==3||3==0||3==3) true
		print("* "); // * * * *
						*     *
	print(" ");

	for(col=4;4<4) false 
	increment row 

	for(rows=2;2<4) true
	for(col=0;0<4) true
		if(2==0||2==3||0==0||0==3) true
		print("* "); // * * * *
						*     *
						*     
	print(" ");

	for(rows=2;2<4) true
	for(col=1;1<4) true
		if(2==0||2==3||1==0||1==3) false
		print(" "); // * * * *
					   *     *
					   *     
	print(" ");
	
	for(rows=2;2<4) true
	for(col=2;2<4) true
		if(2==0||2==3||2==0||2==3) false
		print(" "); // * * * *
					   *     *
					   *     
	print(" ");
	
	for(rows=2;2<4) true
	for(col=3;3<4) true
		if(1==0||1==3||3==0||3==3) true
		print("* "); // * * * *
						*     *
						*     *
	print(" ");
	
	for(col=4;4<4) false 
	increment row 

	for(rows=3;3<4) true
	for(col=0;0<4) true
		if(3==0||3==3||0==0||0==3) true
		print("* "); // * * * *
						*     *
						*     *
						*     
	print(" ");

	for(rows=3;3<4) true
	for(col=1;1<4) true
		if(3==0||3==3||1==0||1==3) true
		print("* "); // * * * *
					   *     *
					   *     *
					   * *    
	print(" ");
	
	for(rows=3;3<4) true
	for(col=2;2<4) true
		if(3==0||3==3||2==0||2==3) true
		print("* "); // * * * *
					    *     *
					    *     *
					    * * *    
	print(" ");
	
	for(rows=3;3<4) true
	for(col=3;3<4) true
		if(3==0||3==3||3==0||3==3) true
		print("* "); // * * * *
						*     *
						*     *
						* * * *    
	print(" ");
	
	for(col=4; 4<4) false
	for(row=4; 4<4) false
*/