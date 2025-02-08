package singletonDesignPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singletonObject1 = Singleton.getInstance();
		
		System.out.println(singletonObject1.hashCode());
		
		Singleton singletonObject2 = Singleton.getInstance();
		
		System.out.println(singletonObject2.hashCode());
		
	}

}


// Both have same hash code which means they are referring to same object.