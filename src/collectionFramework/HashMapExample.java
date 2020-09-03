package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapExample {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		HashMap<Float,String> hm=new HashMap<Float,String>();

		hm.put(4.50f, "GoodMorning");

		hm.put(12.30f, "GoodAfternoon");

		hm.put(18.00f, "GoodEvening");

		hm.put(23.15f, "GoodNight");

		System.out.println(hm.get(4.50f));

		Set set= hm.entrySet();

		Iterator it =set.iterator();

		//hashtable -pass table set collections 

		while(it.hasNext())

		{

		System.out.println(it.next());

		Map.Entry mp=(Map.Entry)it.next();//

		System.out.println(mp.getKey() + " " + mp.getValue());

		}

		}

}
