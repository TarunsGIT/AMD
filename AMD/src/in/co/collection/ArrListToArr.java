package in.co.collection;

import java.util.ArrayList;

public class ArrListToArr {

	public static void main(String[] args) {

		ArrayList<String> L = new ArrayList<String>();
		L.add("Indore");
		L.add("Mysore");
		L.add("Hyderabad");
		L.add("Chennai");

		String arr[] = new String[L.size()];

		for (int i = 0; i < L.size(); i++) {
			arr[i] = L.get(i);

		}

		for (String ele : arr) {

			System.out.print(" " + ele);

		}

	}
}
