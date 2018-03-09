package in.co.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HasMap {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "A");
		m.put(1, "B");
		m.put(2, "C");
		m.put(4, "D");
		m.put(5, "E");

		for (Integer key : m.keySet()) {

			System.out.println(" Keys " + key + " VALUES " + m.get(key));

		}
		System.out.println();
		Set<Integer> s = m.keySet();
		Iterator<Integer> it = s.iterator();
		while (it.hasNext()) {
			int i = it.next();
			System.out.println("KEYS " + i + " VALUES " + m.get(i));

		}
		System.out.println();
		Set<Map.Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry e : entrySet) {
			System.out.println(" KEYS " + e.getKey() + " VALUES "
					+ e.getValue());

		}

	}
}
