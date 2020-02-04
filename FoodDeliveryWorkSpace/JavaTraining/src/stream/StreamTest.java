package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {

		Stream<Integer> strObj =Stream.of(23,11,45,67,77);
		strObj.forEach(System.out::println);
		
		//System.out.println(strObj.toString());
		
		Stream<Integer> strObj1 = Stream.of(new Integer[]{2,3,4,5,6,7,8,9});
		//strObj1.forEach(a -> System.out::println);
		strObj1.forEach(b ->System.out.println(b));
		
		List<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("d");
		al.add("c");
		al.add("g");
		al.add("k");
		
		
		Stream<String> strem2 = al.stream();
		strem2.forEach(c->System.out.println(c));
	}

}
