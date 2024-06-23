package com.pace.emp.crud.main;
import com.pace.emp.crud.dao.EmployeeCrud;
import com.pace.emp.crud.bean.Employee;

public class MainEmpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee jhon=new Employee(101,"jhon",20000.00f,"Hyderabad");
		Employee smith=new Employee(102,"smith",50000.00f,"vizag");
		Employee jack=new Employee(103,"jack",30000.00f,"Bangaluru");
		Employee clark=new Employee(104,"clark",40000.00f,"pune");
		EmployeeCrud empCrud=new EmployeeCrud();
		empCrud.addEmp(jhon);
		empCrud.addEmp(smith);
		empCrud.addEmp(jack);
		empCrud.addEmp(clark);
		
		empCrud.showEmpDetails();
		
		empCrud.updateEmpDetails(102);
		empCrud.showEmpDetails();
		
		empCrud.clearEmpDetails();
	}

}
