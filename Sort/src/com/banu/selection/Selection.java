package com.banu.selection;

public class Selection {

	
	void selecSort(int arr[]) {

		int i;
		int j;
		int temp;
		int size=arr.length;
		for(i = 0; i < size; i ++)
		{
			int minIndex = i;
			for(j = i + 1; j < size; j ++)
			{
				if(arr[j] < arr[minIndex])
				{
					minIndex = j;
				}
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	void display(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
