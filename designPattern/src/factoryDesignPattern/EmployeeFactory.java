package factoryDesignPattern;

public class EmployeeFactory {

	// get the employee
	public static Employee getEmployee(String empType) {
		if(empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
			return new AndroidDeveloper();
		}
		else if(empType.trim().equalsIgnoreCase("BACKEND DEVELOPER")) {
			return new BackendDeveloper();
		}
		else {
			return null;
		}
	}
}
