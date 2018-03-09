package in.co.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateINArr {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 4, 5 };

		Set<Integer> s = new HashSet<Integer>();

		for (int elements : arr) {

			if (!s.add(elements)) {
				System.out.println("Duplicate " + elements);
			}

		}
	}

}
