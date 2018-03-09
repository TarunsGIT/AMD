package in.co.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DupInArrayList {

	public static void main(String[] args) {
		List<Integer> L = new ArrayList<Integer>();
		L.add(1);
		L.add(2);
		L.add(3);
		L.add(4);
		L.add(5);
		L.add(1);

		System.out.println("All Elements");

		for (Integer ele : L) {
			System.out.println(ele);

		}

		Set<Integer> set = new HashSet<Integer>();

		set.addAll(L);
		L.clear();
		L.addAll(set);

		System.out.println("After Removal of Duplicate Elements");

		for (Integer elements : L) {

			System.out.println(elements);

		}

	}
}