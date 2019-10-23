package employeemanagement;

import java.util.Scanner;

public abstract class Employee {
	Scanner scan = new Scanner(System.in);
	String name;
	String code;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
}
