package com.banu.bubble;

/*Best TimeComplexity = O(n)
 * Average Case = O(n^2)
 * Worst case = O(n^2)
  
   Space Complexity = O(1)
*/

public class Bubble {

	void bubbleSort(int arr[]) {
		int flag = 0;
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0)
				break;

		}
	}

	void display(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}