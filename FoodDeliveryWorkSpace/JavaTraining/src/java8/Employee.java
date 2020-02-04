package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

interface customLamda{
	List<Employee> ageFilter(List<Employee> lst);
}

public class Employee {
	private String name;
	private int salary;
	private int age;
	public Employee(String name, int sal, int age) {
		this.setName(name);
		this.setSalary(sal);
		this.setAge(age);
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}


	void DisplayAge40(List<Employee> ageList){

		List<Employee> age40 = new ArrayList<>();

		for(int i=0;i<ageList.size();i++){
			if(ageList.get(i).age < 40){
				age40.add(ageList.get(i));
			}
		}
		System.out.println(age40.toString());
		age40=null;

	}

	int DisplaySal(List<Employee> salList){
		List<Employee> salAl= new ArrayList<>();
		for(int i=0;i<salList.size();i++){
			if(salList.get(i).salary < 50000 ){
				salAl.add(salList.get(i));	
			}
		}
		System.out.println(salAl.toString());
		salAl=null;
		return 0;
	}

	int DisplaySalAndAge(List<Employee> salList){
		List<Employee> salAl= new ArrayList<>();
		for(int i=0;i<salList.size();i++){
			if(salList.get(i).salary < 50000 && salList.get(i).age < 40){
				salAl.add(salList.get(i));	
			}
		}
		System.out.println(salAl.toString());
		salAl=null;
		return 0;

	}

	public static void main(String[] args) {
		Employee emp = new Employee("Emp2",49000,35);
		Employee emp1 = new Employee("Emp1",45000,40);
		Employee emp2 = new Employee("Emp2",55000,30);
		ArrayList<Employee> al = new ArrayList<>();
		al.add(emp);
		al.add(emp1);
		al.add(emp2);

		Employee  e1 = new Employee();
//		e1.DisplayAge40(al);
//		e1.DisplaySal(al);
//		e1.DisplaySalAndAge(al);
		List<Employee> lamdaList = new ArrayList<>();

		
		//Custom Predict Implimentation
		CustomPredicate p = new CustomPredicate();		
		System.out.println(al.stream().filter(p).collect(Collectors.toList()));
		
		//Java 8 Predicate 
		Predicate<Employee> filetByHighSal =(e) ->e.getSalary() >50000;
		Predicate<Employee> filetBylowSal =(e)-> e.getSalary() <50000;
		Predicate<Employee> filetByhighAge =(e)->e.getAge() < 40;
		al.stream()
			.filter(filetByHighSal)
			.forEach(System.out :: println);
		
		System.out.println(" \n Second Stream Here ");
		al.stream()
			.filter(filetBylowSal)
			.forEach(System.out::print);
		System.out.println(" \n Third Stream Stream Here ");
		
		al.stream()
			.filter(filetByhighAge)
			.forEach(System.out::print);
	}	
}

class CustomPredicate implements Predicate<Employee>{

	@Override
	public boolean test(Employee e) {
		System.out.println("Calle here ");
		return e.getSalary() >50000;	
	}
	
}