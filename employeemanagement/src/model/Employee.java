package model;

import java.util.Date;
import java.util.Scanner;

public class Employee {
	int empId;
	String empName;
	String panNo;
	String department;
	int salary;	
	String dateOfjoin;
	String project;
	
	public Employee(int empId, String empName, String panNo, String department, int salary, String dateOfjoin,String project) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.panNo = panNo;
		this.department = department;
		this.salary = salary;
		this.dateOfjoin = dateOfjoin;
		this.project=project;
		
	}

	
	
	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDateOfjoin() {
		return dateOfjoin;
	}

	public void setDateOfjoin(String dateOfjoin) {
		this.dateOfjoin = dateOfjoin;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", panNo=" + panNo + ", department=" + department
				+ ", salary=" + salary + ", dateOfjoin=" + dateOfjoin + "]\n";
	}

	
}
