package com.xworkz.sunita.product;
import com.xworkz.sunita.product.constants.ProductType;
public class ProductTester {

	public static void main(String[] args) {
		Product prod=new Product();
		prod.productId="BT3453672";
		prod.name="Bottle";
		prod.price=400;
		prod.type=ProductType.SHOPPING;
		prod.displayInfo();


System.out.println("copying event*******");
try {
	Product product1=prod.clone();
	System.out.println(product1.productId);
	System.out.println(product1.name);
	System.out.println(product1.price);
	product1.displayInfo();
}
catch(CloneNotSupportedException e) {
	e.printStackTrace();
}

}
}