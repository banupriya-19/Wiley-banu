package com.banu.selection;

import java.util.Scanner;



public class SelectionMain {


	public static void main(String[] args) {
		
		Selection selec = new Selection();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int total = sc.nextInt();

		int arr[] = new int[total];
		System.out.println("Enter the values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		selec.selecSort(arr);
		
		System.out.println("Sorted array");
		selec.display(arr);
	}

}
