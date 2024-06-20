package typesOfJavaClasses;

//Normal/Concrete Class
//user defined class name
public class Product 
{
	
	private int productId;
	private String productName;
	private double productPrice;
	private String productCategory;
	
	public Product() 
	{
		
	}

	public Product(int productId, String productName, double productPrice, String productCategory) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
	}
	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	
	//inner classes
	public class A
	{
		
	}
	
}
