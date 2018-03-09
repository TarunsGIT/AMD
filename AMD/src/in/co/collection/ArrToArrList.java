package in.co.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrToArrList {

	public static void main(String[] args) {

		String arr[] = { "Indore", "Mysore", "Hyderabad", "Chennai" };
		ArrayList<String> L = new ArrayList<String>(Arrays.asList(arr));

		L.add("Khargone");

		for (String str : L) {

			System.out.print(" " + str);

		}

	}
}
