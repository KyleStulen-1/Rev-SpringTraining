package com.rev.w1d2;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
	
	private String name;
	private BigDecimal price;
	
	Product(String name, double price) {
		this.name = name;
		this.price = new BigDecimal(price).setScale(2);
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}
	
	public String toString() {
		return this.name + ": " + this.price.toPlainString();
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof Product)) return false;
		Product p = (Product) o;
		
		return (this.name.contentEquals(p.name) && this.price.equals(p.price));
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.price);
	}
	
	

}
