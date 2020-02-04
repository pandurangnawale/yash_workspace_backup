package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest {

	public static void main(String[] args) {

		List<String> lst = new ArrayList<>();
		lst.add("india");
		lst.add("usa");
		lst.add("japan");
		lst.add("chainna");
		lst.add("aus");
		lst.add("rasia");
		lst.add("iab");
		
		lst.stream()
			.filter(s -> s.startsWith("i"))
			.forEach(System.out::println);
		
		//==========FILTER + MAP=======================//
		System.out.println("==================");
		lst.stream()
			.filter(s ->s.startsWith("i"))
			.map(String::toUpperCase)
			.forEach(System.out::println);
		
		//==========FILTER + MAP=======================//
		System.out.println("==================");
		lst.stream()
			.filter(s->s.startsWith("i"))
			.map(String::toUpperCase)
			//.map(s -> s.endsWith("b")) // its not feasible 
			.sorted()
			.forEach(System.out::println);

	}

	
}
