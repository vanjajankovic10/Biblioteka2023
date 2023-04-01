/**
 * 
 */
package bibliotekaTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import biblioteka.Knjiga;

/**
 * @author Korisnik
 *
 */
class KnjigaTest {
	Knjiga k;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		k = new Knjiga();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		k = null;
	}

	@Test
	void testSetNaslovNull() {
		assertThrows(NullPointerException.class, () -> k.setNaslov(null));
	}
	
	@Test
	void testSetNaslovEmpty() {
		assertThrows(IllegalArgumentException.class, () -> k.setNaslov(""));
	}
	
	@Test
	void testSetNaslov() {
		k.setNaslov("Naslov knjige");
		assertEquals("Naslov knjige", k.getNaslov());
	}
	
	@ParameterizedTest
	@CsvSource({
		"0",
		"-1",
		"-300"
	})
	void testSetISBNBrojevi(int broj) {
		assertThrows(IllegalArgumentException.class, () -> k.setIsbn(broj));
	}
	
	@Test
	void testSetISBN() {
		k.setIsbn(3);
		assertEquals(3, k.getIsbn());
	}
	
	@Test
	void testSetIzdavacNull() {
		assertThrows(NullPointerException.class, () -> k.setIzdavac(null));
	}
	
	@Test
	void testSetIzdavacEmpty() {
		assertThrows(IllegalArgumentException.class, () -> k.setIzdavac(""));
	}
	
	@Test
	void testSetIzdavac() {
		k.setIzdavac("Laguna");
		assertEquals("Laguna", k.getIzdavac());
	}
	
	@ParameterizedTest
	@CsvSource({
		"0",
		"-1",
	})
	void testSetIzdanje(int izdanje) {
		assertThrows(IllegalArgumentException.class,() -> k.setIzdanje(izdanje));
	}
	
	@Test
	void testSetIzdanje() {
		k.setIzdanje(2);
		assertEquals(2, k.getIzdanje());
	}
}
