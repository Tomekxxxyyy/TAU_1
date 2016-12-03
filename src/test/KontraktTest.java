package test;

import static org.junit.Assert.*;
import main.Kontrakt;
import main.NieduanyPsikusException;
import org.junit.Test;

public class KontraktTest {
	Kontrakt kontrakt = new Kontrakt();
	
	//cyfrokrad
	@Test
	public void nullException(){
		assertNull(kontrakt.cyfrokrad(4));
	}
	@Test
	public void assertLengthEqualOne(){
		assertTrue(String.valueOf(kontrakt.cyfrokrad(45)).length() == 1);
	}
	@Test
	public void assertLengthEqualFour(){
		assertTrue(String.valueOf(kontrakt.cyfrokrad(45345)).length() == 4);
	}
	// Hultajchochla
	@Test(expected = NieduanyPsikusException.class)
	public void assertNieudanyPsikusException() throws NieduanyPsikusException{
		kontrakt.hultajchochla(4);
	}
	@Test
	public void assertChangeValue() throws NieduanyPsikusException{
		assertTrue(kontrakt.hultajchochla(25) != 25);
	}
	@Test
	public void assertSameLength() throws NieduanyPsikusException{
		assertTrue(String.valueOf(kontrakt.hultajchochla(25)).length() == String.valueOf(kontrakt.hultajchochla(25)).length());
	}
	@Test
	public void contains() throws NieduanyPsikusException{
		assertTrue(kontrakt.hultajchochla(257).toString().contains("2") && kontrakt.hultajchochla(257).toString().contains("5") && kontrakt.hultajchochla(257).toString().contains("7"));
	}
	// Niekształtek
	@Test
	public void equalsTestNotChanging(){
		assertEquals(new Integer(124), kontrakt.nieksztaltek(124));
	}
	@Test
	public void change3to8Test(){
		assertTrue(new Integer(kontrakt.nieksztaltek(3145)).toString().contains("8"));
	}
	@Test
	public void change7to1Test(){
		assertTrue(new Integer(kontrakt.nieksztaltek(8147)).toString().contains("1"));
	}
	@Test
	public void change6to9Test(){
		assertTrue(new Integer(kontrakt.nieksztaltek(6125)).toString().contains("9"));
	}
}
