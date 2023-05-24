package com.rev.w1d2;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class ShoppingCartTest {
	Product car;
	Product computer;
	Product pen;
	Product apple;
	Product salad;
	ShoppingCart cart;
	
	@BeforeEach
	public void setup() {
		car = new Product("Car", 30000);
		computer = new Product("Computer", 1000);
		pen = new Product("Pen", 10);
		apple = new Product("Apple", 1);
		salad = new Product("Salad", 5);
		
		cart = new ShoppingCart();
	}

	@Test
	public void testAddProduct() {
		assertEquals(0, cart.getSize());
		cart.addProduct(car);
		assertEquals(1, cart.getSize());
	}
	
	@Test 
	public void testAddProduct_DuplicateProductObject() {
		cart.addProduct(car);
		cart.addProduct(car);
		assertEquals(1, cart.getSize());
	}
	
	@Test 
	public void testAddProduct_DuplicateProductInformation() {
		cart.addProduct(car);
		cart.addProduct(new Product("Car", 30000));
		assertEquals(1, cart.getSize());
	}
	
	@Test
	public void testRemoveProduct() {
		cart.addProduct(car);
		cart.addProduct(apple);
		cart.removeProduct(car);
		assertEquals(1, cart.getSize());
	}
	
	@Test 
	public void testRemoveProduct_DuplicateInformation() {
		cart.addProduct(car);
		cart.addProduct(apple);
		cart.removeProduct(new Product("Car", 30000));
		assertEquals(1, cart.getSize());
	}
	
	@Test
	public void testTotalPrice() {
		cart.addProduct(car);
		cart.addProduct(computer);
		cart.addProduct(pen);
		assertEquals("31010.00", cart.getTotalPrice());
		cart.addProduct(salad);
		assertEquals("31015.00", cart.getTotalPrice());
		cart.removeProduct(car);
		assertEquals("1015.00", cart.getTotalPrice());
	}
	
	@Test
	public void testDisplayCart() {
		cart.addProduct(car);
		assertEquals("Car: 30000.00", car.toString());
		assertEquals("Car: 30000.00", cart.displayCart());
	}

}
