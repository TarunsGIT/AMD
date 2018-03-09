package in.co.array;

import java.util.HashSet;
import java.util.Set;

public class DistinctINArr {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 4, 5, 6, 6 };

		Set<Integer> s = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (!s.contains(arr[i])) {
				s.add(arr[i]);
				System.out.println(arr[i]);

			}

		}
	}

}
