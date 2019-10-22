package employeemanagement;

import java.util.Scanner;

public class Main {
	
	static void Menu() {
		System.out.println("1-Nhập danh sách nhân viên");
		System.out.println("2-Thêm nhân viên mới");
		System.out.println("3-Xuất danh sách công ty theo cấp bậc");
		System.out.println("4-Cho biết có bao nhiêu nhân viên");
		System.out.println("5-Cho biết có bao nhiêu quản lý");
	}
	
	public static void main(String[] args) {	
		Menu();
		Scanner scan = new Scanner(System.in);
		int select = scan.nextInt();
		
		if(select == 1) {
			System.out.println("a-Production");
			System.out.println("b-Worker");
			System.out.println("c-Manager");
			System.out.println("d-Quit");
			String eSelect = scan.next();
		}
	}

}
