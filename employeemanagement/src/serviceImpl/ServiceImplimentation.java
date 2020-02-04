package serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import model.Employee;
import service.EmployeeInterface;


public class ServiceImplimentation implements EmployeeInterface{

	List<Employee> empAl= EmployeeInterface.empList();
	
	@Override
	public List<Employee> getEmpById(int id) {
		Predicate<Employee> getEmpIdPredicate =(getEmpId) ->getEmpId.getEmpId()==id;
		List<Employee> resultList= new ArrayList<Employee>();
		resultList=empAl.stream()
			.filter(getEmpIdPredicate)
			.collect(Collectors.toList());
		return resultList;
	}

	@Override
	public List<Employee> getEmpByName(String empName) {
		List<Employee> resultList= new ArrayList<Employee>();
		Predicate<Employee> getEmpByNamePredicate = (getEmpByName)->getEmpByName.getEmpName().equalsIgnoreCase(empName);
		resultList=empAl.stream()
				.filter(getEmpByNamePredicate)
				.collect(Collectors.toList());
		return resultList;
	}

	@Override
	public Optional<Employee> findMaxSalaryedEmployee() {
		Optional<Employee> maxObject = null;
		try {
			maxObject = empAl.stream()
					.max(Comparator.comparing(Employee::getSalary));
			
		}catch (Exception ex) {
			System.out.println(ex);
		}
		return  maxObject;
	}

	@Override
	public List<Employee> getEmpByDept(String deptName) {
		List<Employee> result = new ArrayList<>();
		try {
			Predicate<Employee> getEmpByDept = (empDept)->empDept.getDepartment().equalsIgnoreCase(deptName);
			result=empAl.stream()
					.filter(getEmpByDept)
					.collect(Collectors.toList());
		}catch (Exception ex) {
			System.out.println(ex);
		}
		
		return result;
	}

	@Override
	public List<Employee> getEmpByNameAndSalary(String empName, Integer empSal) {
		
		Predicate<Employee> getEmpName =(gEmpName)->gEmpName.getEmpName().equalsIgnoreCase(empName);
		Predicate<Employee> getEmpSal =(gEmpSal)->gEmpSal.getSalary()==empSal;
		List<Employee> result = new ArrayList<>();
		result = empAl.stream()
					.filter(getEmpName.and(getEmpSal))
					.collect(Collectors.toList());
		return result;
		
	}

	@Override
	public void getDepartmentList() {
		empAl.stream()
				.map(Employee::getDepartment)
				.distinct()
				.forEach(System.out::println);
	}

}
