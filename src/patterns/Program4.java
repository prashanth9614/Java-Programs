package patterns;

public class Program4 {
	
	public static void main(String[] args)
	{
		int n=4;	
		char count=65;
		for(int rows=0;rows<n;rows++)
		{
			for(int col=0;col<n;col++)
			{
				if(rows>=col)
				System.out.print(count++ + " ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}


}
}