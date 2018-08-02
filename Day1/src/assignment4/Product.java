package assignment4;

public class Product {

	private int productId,quantity;
	private String productName;
	private float productCost;

	private double billAmount;

	public Product() {
		super();

	}

	public Product(int productId, String productName, float productCost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
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

	public float getProductCost() {
		return productCost;
	}

	public void setProductCost(float productCost) {
		this.productCost = productCost;
	}

	void generateBill(int quantity) {
		this.quantity=quantity;
		billAmount = this.productCost * quantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost + ", quantity=" + quantity + ", Bill Amount ="
				+ billAmount + "]";
	}

}
