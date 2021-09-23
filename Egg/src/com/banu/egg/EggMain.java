package com.banu.egg;

import java.util.*;
public class EggMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of eggs");
		int eggs=sc.nextInt();
		EggDozenGross e=new EggDozenGross(eggs);
		e.setGross(eggs/144);
		int abovegross=eggs%144;
		e.setDozens(abovegross/12);
		e.setLeftover(abovegross%12);
		System.out.println("Gross = "+e.getGross());
		System.out.println("Dozens = "+e.getDozens());
		System.out.println("LeftOver = "+e.getLeftover());
	}

}
