package com.pace.emp.crud.dao;
import com.pace.emp.crud.bean.Employee;
import java.util.HashSet;
import java.util.Scanner;
public class EmployeeCrud {
	String loc;
	HashSet<Employee>empList=new HashSet<Employee>();
	public void addEmp(Employee emp) {
		empList.add(emp);
	}
	public void showEmpDetails() {
		for(Employee emp:empList) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
			System.out.println(emp.getLocation());
		}
	}
	public void updateEmpDetails(int id) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Location:");
		loc=sc.next();
		for(Employee emp:empList) {
			if(id==emp.getId())
				emp.setLocation(loc);
		}
		
	}
	public void clearEmpDetails() {
		empList.clear();
	}

}
