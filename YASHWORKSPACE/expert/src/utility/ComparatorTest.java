package utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest implements Comparator<ComparatorTest>{
	
	int age;
	int salary;
	String name;
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ComparatorTest(int age,int salary,String name) {
		this.age=age;
		this.salary=salary;
		this.name=name;
	}

	@Override
	public String toString() {
		return " age=" + age + ", salary=" + salary + ", name=" + name + " \n";
	}


	@Override
	public int compare(ComparatorTest o1, ComparatorTest o2) {
		
		 return o1.getName().compareTo(o2.getName());
	}
	
	
	public static Comparator<ComparatorTest> NameComparator = new Comparator<ComparatorTest>() {

        @Override
        public int compare(ComparatorTest e1, ComparatorTest e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
    
    public static Comparator<ComparatorTest> ageComparator = new Comparator<ComparatorTest>() {
		
		@Override
		public int compare(ComparatorTest o1, ComparatorTest o2) {
			
			return o1.getAge() - o2.getAge();
		}
	};

	public static void main(String[] args) {
		ComparatorTest obj = new ComparatorTest(28, 50000, "A");
		ComparatorTest obj1 = new ComparatorTest(29, 50000, "C");
		ComparatorTest obj2 = new ComparatorTest(20, 50000, "B");
		
		ArrayList<ComparatorTest> al = new ArrayList<>();
		al.add(obj);
		al.add(obj1);
		al.add(obj2);
		//al.sort(NameComparator);
		al.sort(ageComparator);
		System.out.println(al);
	}


}
