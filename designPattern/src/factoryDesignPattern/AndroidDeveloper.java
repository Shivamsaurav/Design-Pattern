package factoryDesignPattern;

public class AndroidDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.print("Android Developer salary credited: ");
		return 40000;
	}

}
