package com.cybage.sortingcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>{
	String name;
	double salary;
	int employeeId;
	public Employee(String name, double salary, int employeeId) {
		super();
		this.name = name;
		this.salary = salary;
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", employeeId=" + employeeId + "]";
	}
	@Override
	public int compareTo(Employee o) {	
		return this.name.compareTo(o.name);
		//return this.employeeId-o.employeeId;
			
	}
	
	
}

class Demo implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.employeeId>o2.employeeId) return 1;
		if(o1.employeeId<o2.employeeId) return -1;
		else {
			if(o2.salary>o2.salary) return 1;
			if(o2.salary<o2.salary) return -1;
			else return 0;
		}
		
	}
	
}

public class SortingEmployeeUsingComparable {

	public static void main(String[] args) {
		
		List<Employee> listEmployee = new ArrayList<Employee>();
		
		Employee employee1 = new Employee("Anil", 50000.00, 35245);
		Employee employee2 = new Employee("Sunil", 35000.00, 35345);
		Employee employee3 = new Employee("Mahesh", 60000.00, 35545);
		Employee employee4 = new Employee("Mohan", 45000.00, 35325);
		Employee employee5 = new Employee("Onkar", 70000.00, 35645);
		listEmployee.add(employee1);
		listEmployee.add(employee2);
		listEmployee.add(employee3);
		listEmployee.add(employee4);
		listEmployee.add(employee5);
		Collections.sort(listEmployee);
		System.out.println("comparison on name");		
		listEmployee.forEach(n->System.out.println(n.toString()));
		System.out.println();
		
		
		System.out.println("comparison on salary");
		
		Collections.sort(listEmployee,(e1,e2)->(int)(e1.salary - e2.salary));
		
		//Collections.sort(listEmployee,new Demo());
		
		listEmployee.forEach(n->System.out.println(n.toString()));
		System.out.println();
		
		System.out.println("comparison on employeeId");
		Collections.sort(listEmployee,(e1,e2)->(int)(e1.employeeId- e2.employeeId));
		listEmployee.forEach(n->System.out.println(n.toString()));
	}

}
