package com.pace.collections.list;

import java.util.ArrayList;

public class MainEmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee kumar=new Employee(101,"kumar",30000.00f);
		Employee jhon=new Employee(102,"jhon",40000.00f);
		Employee smith=new Employee(103,"smith",50000.00f);
		
		ArrayList<Employee>empList=new ArrayList<Employee>();
		//add employee objects
		empList.add(kumar);
		empList.add(jhon);
		empList.add(smith);
		for(Employee emp:empList) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
		}
		float result=0; 
		for(Employee employee:empList) {
			
			result=result+employee.getSalary();
		}
		System.out.println("sum:"+result);



	}

}
