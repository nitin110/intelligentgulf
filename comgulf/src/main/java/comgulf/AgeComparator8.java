package comgulf;

import java.util.Comparator;

public class AgeComparator8 implements Comparator<Comparator8> {
	public int compare(Comparator8 s1, Comparator8 s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}