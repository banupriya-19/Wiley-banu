package com.shop;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Product product = new Product();
		System.out.println("Enter product number and quantity\n");
		int number = scanner.nextInt();
		int quantity = scanner.nextInt();
		product.setPordNumber(number);
		product.setProductQuantity(quantity);
		product.calculateRetailPrice();
		scanner.close();
	}

}
