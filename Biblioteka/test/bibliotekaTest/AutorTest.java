package bibliotekaTest;
/**
 * 
 */


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import biblioteka.Autor;

/**
 * @author Vanja Jankovic
 *
 */
class AutorTest {
	Autor a;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		a = new Autor();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		a = null;
	}

	@Test
	void testSetImeNull() {
		assertThrows(NullPointerException.class, () -> a.setIme(null));
	}
	
	@Test
	void testSetImePrazanString() {
		assertThrows(IllegalArgumentException.class, () -> a.setIme(""));
	}
	
	@Test
	void testSetImeSveOk() {
		a.setIme("Pera");
		assertEquals("Pera", a.getIme());
	}
	
	@Test
	void testSetPrezimeNull() {
		assertThrows(NullPointerException.class, () -> a.setPrezime(null));
	}
	
	@Test
	void testSetPrezimePrazanString() {
		assertThrows(IllegalArgumentException.class, () -> a.setPrezime(""));
	}
	
	@Test
	void testSetPrezimeSveOk() {
		a.setPrezime("Peric");
		assertEquals("Peric", a.getPrezime());
	}
	
	@Test
	void testToString() {
		a.setIme("Pera");
		a.setPrezime("Peric");
		
		String s = a.toString();
		
		assertTrue(s.contains("Pera"));
		assertTrue(s.contains("Peric"));
	}
	
	@Test
	void testToStringFormat() {
		a.setIme("Pera");
		a.setPrezime("Peric");
		
		String s = a.toString();
		
		assertEquals("Pera, Peric", s);
	}
	
	@ParameterizedTest
	@CsvSource({
		"Pera, Peric, Pera, Peric, true",
		"Pera, Zikic, Pera, Peric, false",
		"Zika, Peric, Pera, Peric, false",
		"Zika, Zikic, Pera, Peric, false",
	})
	void testEquals(String ime1, String prezime1, String ime2, String prezime2, boolean isti) {
		a.setIme(ime1);
		a.setPrezime(prezime1);
		
		Autor a1 = new Autor();
		a1.setIme(ime2);
		a1.setPrezime(prezime2);
		
		assertEquals(isti,a.equals(a1));
	}
	
	@ParameterizedTest
	@CsvSource({
		"Pera, Peric",
	})
	void testAutorKonstruktor(String ime, String prezime) {
		a.setIme(ime);
		a.setPrezime(prezime);
		assertTrue(a.getIme().equals("Pera"));
		assertTrue(a.getPrezime().equals("Peric"));
	}
	
	@Test
	void testEqualsNull() {
		assertFalse(a.equals(null));
	}
	
	@Test
	void testEqualsIstiObj() {
		assertTrue(a.equals(a));
	}
	
	@Test
	void testEqualsDrugaKlasa() {
		assertFalse(a.equals(new Exception()));
	}
	
}
