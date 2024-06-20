package typesOfJavaClasses;


public abstract interface Department //interface class
{
	
	/**
	 *The blank final field may not have been initialized for final variable
	 * Interfaces cannot have constructors
	 * The interface Department cannot define an initializer
	 *  * Abstract methods do not specify a body
	 */
	
	//**support only public static final fields (+)
	public static final int DEPARTMENT_ID = 2029;
	public static final String DEPARTMENT_NAME = "QA";
	
	//static methods
	public static void getDepartment()
	{
		System.out.println(DEPARTMENT_ID);
		System.out.println(DEPARTMENT_NAME);
		
	}
	
	//abstract methods
	public abstract void getDetails();
	
	//nested classes
	public class D
	{
		
	}

}
