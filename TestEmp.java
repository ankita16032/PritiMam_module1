package module1;

import module2.Employee;

public class TestEmp {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.accept();
		employee.display();
		employee.completeProject();
		employee.checkAttendance();
		employee.applyLoan();

	}

}
