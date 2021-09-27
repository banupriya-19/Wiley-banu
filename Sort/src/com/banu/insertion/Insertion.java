package com.banu.insertion;


/* TIME COMPLEXITY
 * Best case: O(n^2)
 * Average Case:O(n^2)
 * Worst Case:O(n^2)
 * Space Complexity: O(1)
 * 
 */
public class Insertion {

	void insertSort(int[] a)
	{
		int i, j, temp; 
		int n=a.length;
	    for (i = 1; i < n; i++) {  
	        temp = a[i];  
	        j = i - 1;  
	  
	        while(j>=0 && temp <= a[j])  
	        {    
	            a[j+1] = a[j];     
	            j = j-1;    
	        }    
	        a[j+1] = temp;    
	    }  
		
	}
	void display(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
