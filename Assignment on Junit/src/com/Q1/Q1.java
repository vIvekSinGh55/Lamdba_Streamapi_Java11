package com.Q1;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) 
	{
		
        MinMaxFinder mn = new MinMaxFinder();
          
        int[] a =  mn.findMinMax(new int[] {56,34,7,3,34,34,53});
         
        System.out.println(a[0]);
        System.out.println(a[1]);
      
         
	}

}
    
class MinMaxFinder {
	 
	public int[] findMinMax(int[] a) {
		int[] arr = new int[2];
		Arrays.sort(a);
		
		arr[0] = a[0];
		arr[1] = a[a.length-1];
		
		return arr;
	}
	

}