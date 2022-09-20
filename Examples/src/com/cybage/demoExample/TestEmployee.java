package com.cybage.demoExample;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee("Rajat Sharma", 1, "News Anchor");
		/*employee.setId(1);
		employee.setName("Rajat Sharma");
		employee.setDesignation("News Anchor");
		System.out.println("Employee id          : "+employee.getId());
		System.out.println("Employee name        : "+employee.getName());
		System.out.println("Employee designation : "+employee.getDesignation());
		System.out.println();
		*/
		System.out.println(employee.toString());
		
		

	}

}
