package com.Q2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class Test2 
{
	MaxMIn2 minmax;
	
	@BeforeEach
	void init()
	{
		minmax=new MaxMIn2();
	}
	
	@RepeatedTest(3)
	@Tag("Math")
	@DisplayName("Should not be run")
	public void testFindMinMax() 
	{
		int a[]= {56,34,7,3,54,3,34,34,53};
		int []expected= {3,56};
		int []actual=minmax.findMinMax(a);
		for(int i=0;i<2;i++) 
		{
			assertEquals(expected[i], actual[i]);
		}
		System.out.println("Min ="+actual[0]);
		System.out.println("Max ="+actual[1]);
		System.out.println("Test Cases Passed");
	}

}