package singletonDesignPattern;

public class Singleton {
	
	/*
	 * Eager initialization: instance is created at class loading time
     * private static final Singleton instance = new Singleton();
	 */
	
    private static volatile Singleton instance;
    
	// Private constructor to prevent instantiation
    private Singleton() {
    	
    }
    
    // Synchronized method to ensure thread safety
    public static Singleton getInstance() {
    	if(instance == null) // First check
    	{
    		synchronized (Singleton.class) 
    		{
				if(instance == null) // Second check
				{
					instance = new Singleton();
				}
			}
    		
    	}
    	return instance;
    }
    
}
