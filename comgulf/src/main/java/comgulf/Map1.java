package comgulf;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		System.out.println(hm.put("A", "B"));
		System.out.println(hm.put("A", "D"));
		System.out.println(hm.put("X", "C"));
		hm.put("chdj", "djj");
		hm.put("chdjd", "bkjuw");
		System.out.println(hm);
		String val = hm.get(1);
		System.out.println("value at:" + val);
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		boolean flag = hm.containsKey(11);
		System.out.println("key exists in map or not:" + flag);
	}

}
