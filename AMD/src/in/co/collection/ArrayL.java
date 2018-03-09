package in.co.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayL {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("A");
		l.add("");
		l.add("C");
		l.add("D");
		l.add("E");

		System.out.println("BY ITERATOR");

		Iterator<String> it = l.iterator();
		while (it.hasNext()) {
			System.out.print(" " + it.next());

		}

		System.out.println("\nBY LIST ITERATOR");

		ListIterator<String> li = l.listIterator();
		while (li.hasPrevious()) {
			String el = li.previous();
			System.out.print(" " + el);

		}

		System.out.println("\nBY ENUMERATION");

		Vector<String> l1 = new Vector<String>();
		l1.addAll(l);
		Enumeration<String> e = l1.elements();
		while (e.hasMoreElements()) {
			String ele = e.nextElement();
			System.out.print(" " + ele);
		}

	}

	/*
	 * public int compareTo(Marksheet M)
	 *  int compare=firstName.compare(m.firstName); 
	 * return (compare !=0 ? : compare lastName.compare(m.lastName);
	 */

}
