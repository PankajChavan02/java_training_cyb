package com.cybage.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Employee class
class Employee{
	private String name;
	private int employeeId;
	private double basicSalary;
	
	public Employee(String name, int employeeId, double basicSalary) {		
		this.name = name;
		this.employeeId = employeeId;
		this.basicSalary = basicSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSalary() {
		return basicSalary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", basicSalary=" + basicSalary + "]";
	}
	
	
}

public class StreamExamples {

	public static void main(String[] args) {
		List<Employee> listEmployee = new ArrayList<Employee>();
		listEmployee.add(new Employee("rakesh", 456213, 30000.00));
		listEmployee.add(new Employee("anil", 456245, 40000.00));
		listEmployee.add(new Employee("jo", 456445, 25000.00));
		listEmployee.add(new Employee("mohit", 456245, 40000.00));
		listEmployee.add(new Employee("pie", 456645, 50000.00));
		
		listEmployee.stream().filter(emp->emp.getName().length()>=4).forEach(System.out::println);	
		
		
		System.out.println();
		System.out.println("Sorted by salary");
		listEmployee.stream().sorted((e,p)->(int)(e.getBasicSalary()-p.getSalary())).forEach(System.out::println);	
		
		System.out.println();
		List<Employee> sortedList = listEmployee.stream().sorted((e,p)->(int)(e.getBasicSalary()-p.getSalary())).collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		System.out.println();
		
	    Stream<Integer> stream =Stream.of(2,3,5,6,7,8,9);
	    System.out.print("Stream of cubes : ");
	    stream.map(x->x=x*x*x).forEach(x->System.out.print(x+"  "));
		

	}

}























