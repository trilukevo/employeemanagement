package employeemanagement;

public class Production extends Employee{
	
	Production(){
		System.out.println("Input name:");
		String name = scan.next();
		System.out.println("Input code");
		String code = scan.next();
		
		this.name = name;
		this.code = generateCode(code);
		
		System.out.println(name + code);
	}
	
	String generateCode(String code) {
		return "PROD" + code;
	}
}
