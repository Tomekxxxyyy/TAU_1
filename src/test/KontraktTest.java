package test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

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
	public void assertContains(){
		assertThat(kontrakt.cyfrokrad(45).toString(), either(containsString("4")).or(containsString("5")));
	}
	@Test
	public void assertLength(){
		assertTrue(String.valueOf(kontrakt.cyfrokrad(45345)).length() == 4);
	}
	// Hultajchochla
	@Test(expected = NieduanyPsikusException.class)
	public void assertNieudanyPsikusException() throws NieduanyPsikusException{
		kontrakt.hultajchochla(4);
	}
	@Test
	public void assertSwitchNumbers() throws NieduanyPsikusException{
		assertEquals(new Integer(52), kontrakt.hultajchochla(25));
	}
	@Test
	public void assertSameLength() throws NieduanyPsikusException{
		assertTrue(kontrakt.hultajchochla(2545).toString().length() == kontrakt.hultajchochla(2545).toString().length());
	}
	@Test
	public void containsNumbers() throws NieduanyPsikusException{
		assertThat(kontrakt.hultajchochla(257).toString(), anyOf(containsString("2"), containsString("5"), containsString("7")));
	}
	// Niekształtek
	@Test
	public void assertsNoChange(){
		assertEquals(new Integer(124), kontrakt.nieksztaltek(124));
	}
	@Test
	public void change3to8Test(){
		assertThat(kontrakt.nieksztaltek(3145).toString(),containsString("8"));
	}
	@Test
	public void change7to1Test(){
		assertTrue(new Integer(kontrakt.nieksztaltek(8247)).toString().contains("1"));
	}
	@Test
	public void change6to9Test(){
		assertTrue(new Integer(kontrakt.nieksztaltek(6125)).toString().contains("9"));
	}
}
