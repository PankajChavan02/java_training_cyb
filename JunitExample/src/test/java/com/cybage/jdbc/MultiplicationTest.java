package com.cybage.jdbc;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MultiplicationTest {
	
	 int multiplier1;
	 int multiplier2;
	
	
	
	public MultiplicationTest(int multiplier1, int multiplier2) {		
		this.multiplier1 = multiplier1;
		this.multiplier2 = multiplier2;
	}
	
	@Parameters
	public static Collection<Object[]> parameters() {
		Object [][]data = {{1,5},{4,8},{9,5},{22,45},{88,49}};
		return Arrays.asList(data);
	}



	@Test
	public void test() {
		Multiplication multiplication = new Multiplication();
		assertEquals(multiplier1*multiplier2, multiplication.multiply(multiplier1, multiplier2));
		
	}

}
