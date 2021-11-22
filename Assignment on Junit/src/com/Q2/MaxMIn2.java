package com.Q2;

public class MaxMIn2 
{

	public int[] findMinMax(int arr[]) 
	{
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<9;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
		}
		int ans[]= {min,max};
		return ans;
		
	}

}