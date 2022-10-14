package com.example.MyBeans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Book {
	@Min(3)
	public int ID;
	
	@Size(min=5,max=50)
	@NotNull
	public String title;
	
	@Max(3)
	public int price;
	
	@NotNull
	public String author;
	
	@Min(5)
	public int qty;
	
	@Size(min = 5, max = 12)
	@NotNull
	private String publisher;

	public Book(@Min(3) int iD, @Size(min = 5, max = 50) @NotNull String title, @Max(3) int price,
			@NotNull String author, @Min(5) int qty, @Size(min = 5, max = 12) @NotNull String publisher) {
		super();
		ID = iD;
		this.title = title;
		this.price = price;
		this.author = author;
		this.qty = qty;
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [ID=" + ID + ", title=" + title + ", price=" + price + ", author=" + author + ", qty=" + qty
				+ ", publisher=" + publisher + "]";
	}
	
	

}
