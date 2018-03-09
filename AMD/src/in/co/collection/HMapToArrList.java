package in.co.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class HMapToArrList {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(522601, "IBM");
		map.put(522602, "INFOSYS");
		map.put(522603, "TCS");
		map.put(522604, "AMAZON");

		System.out.println("ALL KEYS");

		List<Integer> keyList = new ArrayList<Integer>(map.keySet());

		for (Integer keys : keyList) {
			System.out.print(" " + keys);

		}

		System.out.println("\nALL VALUES");

		List<String> values = new ArrayList<String>(map.values());

		for (String val : values) {
			System.out.print(" " + val);

		}

		System.out.println("\nKEYS--VALUES");

		List<Entry> keyvalue = new ArrayList<Entry>(map.entrySet());
		for (Entry temp : keyvalue) {
			System.out.print(" " + temp);

		}

	}

}
