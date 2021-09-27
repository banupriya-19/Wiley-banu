package com.banu;

public class Truck extends Vehicle
{

	public Truck(String model, String color, int numOfWheels) {
		super(model, color, numOfWheels);
		
	}

	public void display()
	{
		System.out.println("Truck runs......!");
	}

}