package employeemanagement;

import java.util.ArrayList;

public class Company {
	ArrayList<Employee> empList= new ArrayList<Employee>();
	
	void addEmployee(Employee e) {
		if(empList.size() < 200)
			empList.add(e);
		else
			System.out.println("Hết slot!");
	}
	
	void showEmployeeList() {
		for (Employee e : empList) {
			System.out.println("Name: "+ e.getName() +"||"+ "Position: "+ e.getCode());
		}
	}
}
