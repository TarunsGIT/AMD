package in.co.amd;

import java.util.HashSet;

public class DuplicateElements {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 6, 7 };
		HashSet<Integer> set = new HashSet<Integer>();

		for (Integer elements : arr) {
			if (!set.add(elements)) {
				System.out.println("Duplicate " + elements);

			}

		}

	}
}