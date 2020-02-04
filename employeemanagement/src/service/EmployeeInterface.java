package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.Employee;

public interface EmployeeInterface {
	
	static List<Employee> empList() {
		List<Employee> empAl = new ArrayList<Employee>();
		empAl.add(new Employee(101, "Datta", "DATA101", "SW", 10000, "01082019","BNY"));
		empAl.add(new Employee(102, "Mahesh", "DATA101", "SW", 20000, "01082019","BNY"));		
		empAl.add(new Employee(103, "Vinod", "DATA101", "HW", 30000, "01082019","BNY"));
		empAl.add(new Employee(104, "Kunal", "DATA101", "HW", 40000, "01082019","BNY"));
		empAl.add(new Employee(105, "Pandu", "DATA101", "SW", 50000, "01082019","BNY"));
		//Employee(int empId, String empName, String panNo, String department, int salary, String dateOfjoin,String project)
		return empAl;
	}

	List<Employee> getEmpByName(String empName);
	
	List<Employee> getEmpById(int empId);

	Optional<Employee> findMaxSalaryedEmployee();

	List<Employee> getEmpByDept(String deptName);

	List<Employee> getEmpByNameAndSalary(String empName, Integer empSal);

	void getDepartmentList();
	
	
}
