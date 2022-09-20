package com.cybage.jdbc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator calculator;

	@Test
	void testAdd() {
		calculator = new Calculator();
		assertEquals(8, calculator.add(5, 3));
	}

	@Test
	void testSub() {
		calculator = new Calculator();
		assertEquals(5, calculator.sub(15, 10));
	}
	
	@Test
	void testAll() {
		calculator = new Calculator();
		assertAll(
				()->assertEquals(8, calculator.add(5, 3)),
				()->assertEquals(5, calculator.sub(15, 10)
						));
	}

}
