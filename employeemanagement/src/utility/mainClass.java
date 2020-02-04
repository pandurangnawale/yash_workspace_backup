package utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import model.Employee;
import service.EmployeeInterface;
import serviceImpl.ServiceImplimentation;

public class mainClass {

	
	public static void main(String[] args) {		
		
		
		try{
			boolean x=true;
			do{
				System.out.println("Enter 1 for Get Employee By Id");
				System.out.println("Enter 2 for Get Employee By Dept");
				System.out.println("Enter 3 for Get Highest Salary Emp");
				System.out.println("Enter 4 for Get Employee By Name");
				System.out.println("Enter 5 for Get Employee By Name & Salary");
				System.out.println("Enter 6 for Get Department List");
				System.out.println("Enter 0 for Exit ");
				
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);		
				String userchoice=sc.nextLine();
				int caseId=1;
				
				//UserDefineException exp = new UserDefineException();
				//exp.validate(userchoice);
				
				try{
					caseId = Integer.parseInt(userchoice);
				}catch (NumberFormatException ex) {
				    System.out.println("Please Enter Valid Input ");
				}
				
				EmployeeInterface service = new ServiceImplimentation();
				List<Employee> al=new ArrayList<Employee>();
				
					switch(caseId){
						case 1:{
							System.out.println("Enter Employee Id to Search : ");
							int empId=sc.nextInt();
							try{
								al= service.getEmpById(empId);
								if(al.size()>0) {
									System.out.println("Employee List : "+al);
								}else {
									System.out.println("EMP ID : "+empId +" Does Not exit \n");
								}
								al=null;
							}catch(Exception ex) {
								ex.printStackTrace();
							}
							x=false;
							break;
						}
						case 2:{
							System.out.println("Enter Employee Name to Search ");
							String empName=sc.nextLine();
							try {
								al=service.getEmpByName(empName);
								if(al.size()>0) {
									System.out.println("Employee List : "+al);
								}else {
									System.out.println("EMP ID : "+empName +" Does Not exit \n");
								}
								
							}catch(Exception ex) {
								ex.printStackTrace();
							}
							al=null;
							x=false;
							break;
						}
						case 3:{
							try {
								Optional<Employee> al1; //= new ArrayList<>();
								al1=service.findMaxSalaryedEmployee();
								System.out.println(al1);
							}catch(Exception ex) {
								ex.printStackTrace();
							}
							al=null;
							x=false;
							break;
						}
						case 4:{
							try {								
								System.out.println("Enter Department Name To Search Employee ");
								String deptName;
								deptName=sc.nextLine();
								al=service.getEmpByDept(deptName);
								if(al.size()>0) {
									System.out.println(al);
								}else {
									System.out.println("No Result found \n");
								}
								
							}catch(Exception ex) {
								ex.printStackTrace();
							}
							x=false;
							al=null;
							break;
						}
						case 5:{
							try {
								System.out.println("Enter Employee Name ");
								String empName=sc.nextLine();
								System.out.println("Enter Employee Salary ");
								int empSal=sc.nextInt();
								al=service.getEmpByNameAndSalary(empName,empSal);
								if(al.size() >0) {
									System.out.println(al);
								}else {
									System.out.println("No Result found \n");
								}								
							}catch(Exception ex) {
								ex.printStackTrace();
							}
							x=false;
							al=null;
							break;
						}
						case 6:{
							try {
								System.out.println("Department List As Below : ");
								service.getDepartmentList();								
							}catch(Exception ex) {
								ex.printStackTrace();
							}
							x=false;
							al=null;
							break;
							
						}
						case 0:{
							System.out.println("Thank You");
							x=true;
							break;
						}
					} //switch
			}while(x==false);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
