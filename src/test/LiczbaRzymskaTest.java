package test;

import static org.junit.Assert.*;
import main.LiczbaRzymska;

import org.junit.Test;

public class LiczbaRzymskaTest {

	@Test
	public void test1() {
		assertEquals("I", new LiczbaRzymska(1).toString());
	}
	
	@Test
	public void test2() {
		assertEquals("III", new LiczbaRzymska(3).toString());
	}
	
	@Test
	public void test3() {
		assertEquals("IV", new LiczbaRzymska(4).toString());
	}
	
	@Test
	public void test4() {
		assertEquals("IX", new LiczbaRzymska(9).toString());
	}
	
	@Test
	public void test5() {
		assertEquals("MMXVI", new LiczbaRzymska(2016).toString());
	}
	
	@Test
	public void testLessThanZero() {
		assertEquals("Liczba musi być wieksza od zera", new LiczbaRzymska(-1).toString());
	}

}
