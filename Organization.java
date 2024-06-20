package typesOfJavaClasses;

//Abstract class
public abstract class Organization 
{
	private int orgId;
	private String orgName;
	
	//static fields
	public static long pincode;
	
	public Organization()
	{
		
	}

	//parameterized constructor
	public Organization(int orgId, String orgName) {
		this.orgId = orgId;
		this.orgName = orgName;
	}
	
	static
	{
		pincode = 412703;
	}

	public void getOrgDetails()
	{
		System.out.println(orgId);
		System.out.println(orgName);
	}
	
	public static void getOrgPincode()
	{
		System.out.println(pincode);
	}
	
	//**abstract methods (+)
	public abstract void get();
	
	//nested classes
	public class B
	{
		
	}
	
}
