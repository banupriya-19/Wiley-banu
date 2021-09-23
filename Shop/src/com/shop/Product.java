package com.shop;

public class Product 
{
	private int pordNumber;
	private int productQuantity;
	
	
	public void setPordNumber(int pordNumber) {
		this.pordNumber = pordNumber;
	}
	
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	public void calculateRetailPrice()
	{
		switch(pordNumber)
		{
		case 1:
			System.out.println("Retail price for product"+pordNumber+ " is " +22.50*productQuantity);break;
		case 2:
			System.out.println("Retail price for product"+pordNumber+ " is " +44.50*productQuantity);break;
		case 3:
			System.out.println("Retail price for product"+pordNumber+ " is " +9.98*productQuantity);break;
		default:
			System.out.println("Invalid product");
		}
	}
}
