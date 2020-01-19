package testing;

import list.LinkedList;

public class CListTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
//		list.add("Bob");
//		list.add("Trey");
//		list.add("Jan");
//		
//		list.add(3, "Kat");
//
//		System.out.println(list);	
//		
		list.add(0, "Bill");
		
		list.add(0, "Kat");

		list.add(2, "Lez");
		
		list.add(0, "Mo");
		System.out.println(list);
		System.out.println(list.size());

		list.remove();
		System.out.println(list.size());
		list.remove();
		System.out.println(list.size());
		System.out.println(list);
		list.remove();
		System.out.println(list.size());
		list.remove();
		System.out.println(list.size());
		System.out.println(list);
		
	}
}
