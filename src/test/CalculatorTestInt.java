package test;

import static org.junit.Assert.*;
import main.CalculatorInt;

import org.junit.Test;

public class CalculatorTestInt {

CalculatorInt calculator = new CalculatorInt();
	
	@Test
	public void assertAdd(){
		assertEquals(5, calculator.add(2, 3));
	}
	
	@Test
	public void assertSub(){
		assertEquals(0, calculator.sub(2, 2));
	}
	
	@Test
	public void assertMulti(){
		assertEquals(4, calculator.multi(2, 2));
	}
	
	@Test
	public void assertDiv(){
		assertEquals(2, calculator.div(4, 2));
	}
	
	@Test
	public void assertGreater(){
		assertEquals(true, calculator.greater(4, 2));
	}
	
	@Test(expected = ArithmeticException.class)
	public void assertArithmeticException(){
		calculator.div(2, 0);
	}

}
