package serialization;

import java.io.Serializable;

public class Product implements Serializable{
	public int prodId;
	public String name;
	public transient int price;
	public String brand;
	public Product(int prodId, String name, int price, String brand) {
		super();
		this.prodId = prodId;
		this.name = name;
		this.price = price;
		this.brand = brand;
	}

}
