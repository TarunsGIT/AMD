package in.co.amd;

import java.util.HashSet;

public class DistinctElements {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 5, 6, 7 };

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (!set.contains(arr[i])) {
				set.add(arr[i]);
				System.out.println(arr[i] + " ");

			}
			

		}
	}

}
