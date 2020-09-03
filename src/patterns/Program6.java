package patterns;

public class Program6 {
	
	public static void main(String[] args)
	{
		int n=5;	
		int count=5;
		for(int rows=0;rows<n;rows++)
		{
			for(int col=0;col<n;col++)
			{
				if(rows>=col)
				System.out.print(count-- + " ");
				else
				System.out.print("  ");
			}
			 count=5;
			System.out.println();
		}
	}

}
