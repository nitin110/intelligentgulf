package comgulf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		String city[] = { "hisar", "agra", "hansi" };
		List<String> al = new ArrayList<String>();
		// (Arrays.asList(city));
		String arr[] = al.toArray(new String[al.size()]);
		System.out.println("Array Elements:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		Collections.addAll(al, city);
		al.add("new city1");
		al.add("new city2");
		for (String str : al) {
			System.out.println(str);
		}
		ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 3));
		System.out.println("SubList stored in ArrayList: " + al2);

		List<String> list = al.subList(1, 4);
		System.out.println("SubList stored in List: " + list);
	}

}
