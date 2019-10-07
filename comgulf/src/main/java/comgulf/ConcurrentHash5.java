package comgulf;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHash5 {

	public static void main(String[] args) {
		ConcurrentHashMap m = new ConcurrentHashMap();
		m.put(100, "Hello");
		m.put(101, "Geeks");
		m.put(102, "Geeks");

		m.putIfAbsent(101, "Hello");

		m.remove(101, "Geeks");

		m.putIfAbsent(103, "Hello");

		m.replace(101, "Hello", "For");
		System.out.println(m);

	}

}
