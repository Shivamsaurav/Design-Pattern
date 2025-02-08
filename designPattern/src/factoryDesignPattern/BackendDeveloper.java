package factoryDesignPattern;

public class BackendDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.print("Backend Developer salary credited: ");
		return 100000;
	}

}
