package employeemanagement;

import java.util.ArrayList;

public class Company {
	ArrayList<Employee> empList= new ArrayList<Employee>();
	
	void addEmployee(Employee e) {
	empList.add(e);
	}
	
	void showEmployeeList() {
		for (Employee e : empList) {
			System.out.println("Name: "+ e.getName() +"||"+ "Position: "+ e.getCode());
		}
	}
}
