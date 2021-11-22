package co.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Myfirstjunit {
	
	@Test
	public void setup() {
		String s="This is my first junit test case";
		assertEquals("This is my first junit test case",s);
	}

}
