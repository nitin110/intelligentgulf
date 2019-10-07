package comgulf;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable7 {

	public static void main(String[] args) {
		ArrayList<Comparable7> al = new ArrayList<Comparable7>();
		al.add(new Comparable7(101, "Vijay", 23));
		al.add(new Comparable7(106, "Ajay", 27));
		al.add(new Comparable7(105, "Jai", 21));

		Collections.sort(al);
		for (Comparable7 st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}
