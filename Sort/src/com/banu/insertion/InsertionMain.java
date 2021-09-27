package com.banu.insertion;

import java.util.Scanner;

public class InsertionMain {

	public static void main(String[] args) {
		
			Insertion inser = new Insertion();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of elements");
			int total = sc.nextInt();

			int arr[] = new int[total];
			System.out.println("Enter the values");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			inser.insertSort(arr);
			
			System.out.println("Sorted array");
			inser.display(arr);
		}
}
