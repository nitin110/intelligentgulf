package comgulf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SynchronizedMap4 {

	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(2, "Anil");
		hmap.put(44, "Ajit");
		hmap.put(1, "Brad");
		hmap.put(4, "Sachin");
		hmap.put(88, "XYZ");
		Map m = Collections.synchronizedMap(hmap);
		Set ss = m.entrySet();
		synchronized (m) {
			Iterator itr = ss.iterator();
			while (itr.hasNext()) {
				Map.Entry me = (Map.Entry) itr.next();
				System.out.print(me.getKey() + ": ");
				System.out.println(me.getValue());
			}
		}
	}

}
