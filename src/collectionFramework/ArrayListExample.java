package collectionFramework;
import java.util.*;

	public class ArrayListExample {
		// can accept duplicate values 
		//ArrayList,LinkedList,vector- Implementing List interface
		//array have fixed size where as arraylist can grow dynamicaly 
		//you can access and insert any value in any index private int i =5; 
		
		public static void main(String[] args){ // TODO Auto-generated method stub

		 ArrayList<String> a=new ArrayList<String>();
		 a.add("rahul");
		 a.add("prashanth");
		 a.add("don"); 
		 System.out.println(a);
		 a.add(0, "ronnie"); 
		 System.out.println(a);
		 /*a.remove(1); 
		  * a.remove("java");
		  *  System.out.println(a);*/
		 System.out.println(a.get(2));
		 // testing 
		 System.out.println(a.contains("java")); 
		 System.out.println(a.indexOf("rahul")); 
		 System.out.println(a.isEmpty());
		 System.out.println(a.size()); 
		 } protected void abc() 
		 { // TODO Auto-generated method stub System.out.println("hello"); 
			 
		 }

		}


