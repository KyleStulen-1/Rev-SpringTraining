package com.rev.w1d2;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class ShoppingCart {
	private Set<Product> products;
	
	ShoppingCart(){
		this.products = new HashSet<Product>();
	}
	
	public void addProduct(Product p) {
		this.products.add(p);
	}
	
	public void removeProduct(Product p) {
		this.products.remove(p);
	}
	
	public String getTotalPrice() {
		return this.products.stream()
				.map(p -> p.getPrice())
				.reduce(BigDecimal.ZERO, BigDecimal::add)
				.toPlainString();
	}
	
	public String displayCart() {
		return this.products.stream()
				.map((p) -> p.toString())
				.reduce("", (partialString, s) -> partialString + s);
	}
	
	public int getSize() {
		return this.products.size();
	}

}
