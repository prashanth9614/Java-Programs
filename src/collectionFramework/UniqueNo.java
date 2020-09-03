package collectionFramework;
import java.util.*;

public class UniqueNo {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int a[] ={ 4,5,5,5,4,6,6,9,4};

		// Print unique number from the list- Amazon 

		//print the string in reverse

		ArrayList<Integer>al =new ArrayList<Integer>();

		for(int i=0;i<a.length;i++)

		{

		int k=0;

		if(!al.contains(a[i]))

		{

	al.add(a[i]);


		k++;

		for(int j=i+1;j<a.length;j++)

		{

		if(a[i]==a[j])

		{

		k++;

		}

		}

		 System.out.println(a[i]);

		System.out.println(k);

		if(k==1)

	//	System.out.println(a[i]+"is unique number");
        System.out.println('2'*1);
		}

		}
		}

}
