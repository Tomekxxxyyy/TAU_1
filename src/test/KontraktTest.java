package test;

import static org.junit.Assert.*;
import main.Kontrakt;
import main.NieduanyPsikusException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Every.everyItem;
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
	
	@Test(expected = NieduanyPsikusException.class)
	public void assertNieudanyPsikusException() throws NieduanyPsikusException{
		kontrakt.hultajchochla(4);
	}
	// Hultajchochla
	@Test
	public void assertChangeValue() throws NieduanyPsikusException{
		assertTrue(kontrakt.hultajchochla(25) != 25);
	}
	@Test
	public void assertSameLength() throws NieduanyPsikusException{
		assertTrue(String.valueOf(kontrakt.cyfrokrad(25)).length() == String.valueOf(kontrakt.cyfrokrad(25)).length());
	}
}
