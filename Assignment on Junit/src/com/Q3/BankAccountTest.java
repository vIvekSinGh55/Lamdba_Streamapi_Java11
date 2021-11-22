package com.Q3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	public void test() 
	{
		BankAccount obj = new BankAccount(10000);
		assertThrows(InsufficientBalanceException.class,() -> obj.withdraw(20000));
	}

}
