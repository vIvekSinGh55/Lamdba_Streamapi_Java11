package com.Q4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class Test4 {
	
	JunitAnnotations Junit=new JunitAnnotations();
	
	@BeforeEach
	public void init() 
	{
		System.out.println("Before Each Test this @beforeEach is Executed"+Junit);
	}
	
	
	@AfterEach
	public void clean() 
	{
		System.out.println("After Each is Executed Cleaning up");
	}
	
	
	@BeforeAll
	public void before1() 
	{
		System.out.println("Before All Annotation");
	}
	
	@AfterAll
	public void after() 
	{
		System.out.println("End of Coding!");
	}
	
	

	public void test1() 
	{
		int expected=68;
		int actual=Junit.add(8,60);
		assertEquals(expected, actual);
	}
	
	public void test2() 
	{
		int expected=50;
		int actual=Junit.multiply(10,5);
		assertEquals(expected, actual);
	}



}