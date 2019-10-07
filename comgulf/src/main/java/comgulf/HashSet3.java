package comgulf;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet3 {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		hs.add("usa");
		hs.add("china");
		hs.add("pak");
		hs.add("india");
		hs.add("usa");
		//hs.add(null);
		//hs.add(null);
		System.out.println(hs);
		Set<String> ts = new TreeSet<String>(hs);
		System.out.println("TreeSet contains: ");
		for (String temp : ts) {
			System.out.println(temp);
		}
	}
}