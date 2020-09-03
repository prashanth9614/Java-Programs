package collectionFramework;

import java.util.*;
public class HashSetExample {
// HashSet, LinkedHashSet, TreeSet implements set interface
// does not support duplicate values
// insertion order is not followed in HashSet
public static void main(String[] args) {
	LinkedHashSet<String> hs = new LinkedHashSet<String>();
	hs.add("USA");
	hs.add("UK");
	hs.add("INDIA");
	hs.add("JAPAN");
	hs.add("SOUTH KOREA");
	
	Iterator<String> i = hs.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}



}
