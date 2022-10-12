package org;
public class ProductBuilder {
	private int ID;
	private String name;
	private String brand;
	private int price;
	
	public ProductBuilder() {}
	public Product Builderproduct() {
		return new Product(ID,name,brand,price);
	}
		
	public ProductBuilder ID(int passedId)
	{
		this.ID=passedId;
		return this;	
	}
	public ProductBuilder name(String passedName)
	{
		this.name=passedName;
		return this;
	}
	public ProductBuilder brand(String passedBrand)
	{
		this.brand = passedBrand;
		return this;
	}
	public ProductBuilder price(int passedprice)
	{
		this.price = passedprice;
		return this;		
	}



}
