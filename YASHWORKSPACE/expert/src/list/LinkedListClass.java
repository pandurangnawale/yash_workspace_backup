package list;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add(null);
		ll.add("Pandurang");
		ll.add("Poonam");
		ll.add("Poonam");
		ll.add(null);
		ll.add(null);
		
		System.out.println(ll);
		ll.removeFirst();
		ll.remove(3);
		ll.removeLast();
		System.out.println(ll);
		

	}

}
