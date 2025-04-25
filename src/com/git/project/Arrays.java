package com.git.project;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		
		//Initialize the array 
		int[] arr = {2, 4, 1, 5, 7};
		// Output: max = 7, min = 1
		List<Integer> list = new ArrayList<>();
		

		
		for(int n :arr) {
			list.add(n);
		}
		Collections.sort(list);
		
		System.out.println("Min :"+list.get(0)+" Max: "+list.get(list.size()-1));
		
		
		System.out.println("-------------------------Reverse An array");
		
		System.out.println("before reverse :"+list);
		
		List<Integer> rList  = new ArrayList<>();
		for(int i = arr.length-1;i>=0;i--) {
			rList.add(arr[i]);
		}
		
		Integer[] arr1 = new Integer[rList.size()];
		
		arr1 = rList.toArray(arr1);
		
		System.out.println("After reverse :"+rList);
		
		
	System.out.println("------------------SecondLargest");
	
	System.out.println("SecondLargest :"+list.get(list.size()-2));
	
	


	}

}
