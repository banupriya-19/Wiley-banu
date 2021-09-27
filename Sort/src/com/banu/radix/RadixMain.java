package com.banu.radix;

import java.util.Scanner;

import com.banu.merge.Merge;

public class RadixMain {

	
public static void main(String[] args) {
		
		Radix rad = new Radix();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int total = sc.nextInt();

		int arr[] = new int[total];
		System.out.println("Enter the values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		rad.radixSort(arr);
		
		System.out.println("Sorted array");
		rad.display(arr);
	}
}
