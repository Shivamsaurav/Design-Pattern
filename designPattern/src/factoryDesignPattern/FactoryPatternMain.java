package factoryDesignPattern;

public class FactoryPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = EmployeeFactory.getEmployee("BACKEND DEVELOPER");
		System.out.println(employee.salary());
		
		Employee employee2 = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
		System.out.println(employee2.salary());
		
		
	}

}
