package queue;

/*
 * PriorityQueue Does not allowed null object
 * */

import java.util.PriorityQueue;

public class PriorityQueueClass{

	int id;
	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		try {
			pq.add(89);
			pq.add(1);
			pq.add(4);
			pq.add(1);
			pq.add(441);
			//pq.add("String");
			pq.add(1);
			pq.add(3);
			pq.add(1);
			pq.add(5);
			pq.add(31);
			//pq.add(null);
		}catch(Exception ex) {
			ex.printStackTrace();			
		}
		//System.out.println("MAX "+pq.peek());
		//System.out.println("MIN "+pq.poll());
		//System.out.println(pq+" "+ pq.hashCode());
		
		Integer arr[] = new Integer[pq.size()];
		pq.toArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" "+ arr[i].hashCode());
		}
	}

	

}
