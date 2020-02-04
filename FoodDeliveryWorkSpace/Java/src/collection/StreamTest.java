package collection;

import java.util.Arrays;
import java.util.List;

public class StreamTest {

	public static void main(String[] args) {
		List<String> lst = Arrays.asList("a","b","c","d","e","f");
		
		lst.stream().filter(s->s.startsWith("a"))
					.map(String::toUpperCase)
					.sorted()
					.forEach(System.out::println);

	}

}
