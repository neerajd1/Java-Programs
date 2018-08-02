package assignment4;

public class TestProduct {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.setProductId(2);
		p1.setProductName("Pen");
		p1.setProductCost(30);
		p1.generateBill(60);
		
		
		
		Product p2=new Product(1, "Pencil", 5);
		p2.generateBill(100);
		
		System.out.println(p1+ "\n" +p2);

	}

}
