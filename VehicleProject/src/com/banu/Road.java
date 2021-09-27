package com.banu;

public class Road {

public static void main(String[] args) {
		
		Vehicle truck=new Truck("Ashok Leyland","Red",6);
		Vehicle car=new Car("Ferrari","Black",4);
		Vehicle bus=new Bus("BharatBenz","Blue",6);
		
		Vehicle[] vehicle={truck,car,bus};
		
		for(Vehicle v:vehicle)
		{
			v.display();
			System.out.println(v);	
		}	
	}
}
