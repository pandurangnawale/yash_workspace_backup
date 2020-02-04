package utility;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest implements Comparable<ComparableTest>{
	
	int age;
	int salary;
	String name;
	
	public ComparableTest(int age, int salary,String name) {
		this.age=age;
		this.salary=salary;
		this.name=name;
	}

	@Override
	public String toString() {
		return "ComparableTest [age=" + age + ", salary=" + salary + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		
		ComparableTest obj = new ComparableTest(28, 50000, "Jinal");
		ComparableTest obj1 = new ComparableTest(29, 50000, "Jinal");
		ComparableTest obj2 = new ComparableTest(20, 50000, "Jinal");
		
		ArrayList<ComparableTest> al = new ArrayList<>();
		al.add(obj);
		al.add(obj1);
		al.add(obj2);
		
		System.out.println(obj.compareTo(obj));
		
		Collections.sort(al);
		System.out.println(al.get(0).toString());
		
	}

	@Override
	public int compareTo(ComparableTest o) {		
			return this.age-o.age;		
	}

}
