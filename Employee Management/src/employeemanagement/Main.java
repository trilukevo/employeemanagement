package employeemanagement;

import java.util.Scanner;

public class Main {
	
	static void Menu() {
		System.out.println("=======================================");
		System.out.println("1-Nhập danh sách nhân viên");
		System.out.println("2-Thêm nhân viên mới");
		System.out.println("3-Xuất danh sách công ty theo cấp bậc");
		System.out.println("4-Cho biết có bao nhiêu nhân viên");
		System.out.println("5-Cho biết có bao nhiêu quản lý");
		System.out.println("=======================================");
	}
	
	public static void main(String[] args) {
		Company company = new Company();
		String eSelect;
		while(true) {
			Menu();
			Scanner scan = new Scanner(System.in);
			int select = scan.nextInt();			
			switch (select) {
			case 1:
				do {
					System.out.println("+++++++++++++++");
					System.out.println("a-Production");
					System.out.println("b-Worker");
					System.out.println("c-Manager");
					System.out.println("d-Quit");
					System.out.println("+++++++++++++++");
				
					eSelect = scan.next();
					switch (eSelect) {
					case "a":
						Employee p1 = new Production();
						company.addEmployee(p1);
						break;
					case "b":
						Employee p2 = new Worker();
						company.addEmployee(p2);
						break;
					case "c":
						Employee p3 = new Manager();
						company.addEmployee(p3);
						break;
					default:
						break;
					}
				}while(!eSelect.equalsIgnoreCase("d"));
				break;
			case 2:
					System.out.println("+++++++++++++++");
					System.out.println("a-Production");
					System.out.println("b-Worker");
					System.out.println("c-Manager");
					System.out.println("+++++++++++++++");
					
					eSelect = scan.next();
					switch (eSelect) {
					case "a":
						Employee p1 = new Production();
						company.addEmployee(p1);
						break;
					case "b":
						Employee p2 = new Worker();
						company.addEmployee(p2);
						break;
					case "c":
						Employee p3 = new Manager();
						company.addEmployee(p3);
						break;
					default:
						break;
					}				
				break;
			case 3:
				company.showEmployeeList();
				break;
			case 4:
				System.out.println("Tổng số nhân viên: " + company.empList.size());
			}
		}
	}

}
