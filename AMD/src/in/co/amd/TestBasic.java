package in.co.amd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestBasic {

	public static void main(String[] args) {
		Basic b1 = new Basic();
		b1.setEmpId(100);
		b1.setFirstName("BABA");
		b1.setLastName("GURU");

		Basic b2 = new Basic();
		b1.setEmpId(101);
		b1.setFirstName("BABA");
		b1.setLastName("GURU");

		Set<Basic> s = new TreeSet<Basic>();
		s.add(b1);
		s.add(b2);

		Iterator<Basic> it = s.iterator();

		while (it.hasNext()) {

			Basic b = it.next();
			System.out.println(b.getEmpId());
			System.out.println(b.getFirstName());
			System.out.println(b.getLastName());

		}

	}

}
