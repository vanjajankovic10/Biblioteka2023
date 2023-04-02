package biblioteka.interfejs.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import biblioteka.Knjiga;
import biblioteka.interfejs.BibliotekaInterfejs;


public abstract class BibliotekaInterfejsTest {
	protected BibliotekaInterfejs biblioteka;
	
	@Test
	void testDodajKnjiguNull() {
		assertThrows(NullPointerException.class, () -> biblioteka.dodajKnjigu(null));
	}

	@Test
	void testDodajKnjiguPostoji() {
		Knjiga k = new Knjiga();
		k.setIsbn(1234);
		biblioteka.dodajKnjigu(k);
		assertThrows(IllegalArgumentException.class, () -> biblioteka.dodajKnjigu(k));
	}

	@Test
	void testDodajKnjigu() {
		Knjiga k = new Knjiga();
		k.setIsbn(1234);
		biblioteka.dodajKnjigu(k);
		assertEquals(1, biblioteka.vratiSveKnjige().size());
		assertTrue(biblioteka.vratiSveKnjige().contains(k));
	}
	
	@Test
	void testDodajKnjigu2() {
		Knjiga k = new Knjiga();
		k.setIsbn(1234);
		biblioteka.dodajKnjigu(k);
		Knjiga k1 = new Knjiga();
		k1.setIsbn(2345);
		biblioteka.dodajKnjigu(k1);
		assertEquals(2, biblioteka.vratiSveKnjige().size());
		assertTrue(biblioteka.vratiSveKnjige().contains(k));
		assertTrue(biblioteka.vratiSveKnjige().contains(k1));
	}
	
	@Test
	void testObrisiKnjigu() {
		Knjiga k = new Knjiga();
		k.setIsbn(1234);
		biblioteka.dodajKnjigu(k);
		Knjiga k1 = new Knjiga();
		k1.setIsbn(2345);
		biblioteka.dodajKnjigu(k1);
		biblioteka.obrisiKnjigu(k);
		assertEquals(1, biblioteka.vratiSveKnjige().size());
		assertTrue(biblioteka.vratiSveKnjige().contains(k1));
	}
	
	@Test
	void testObrisiKnjiguNePostoji() {
		Knjiga k = new Knjiga();
		k.setIsbn(1234);
		biblioteka.dodajKnjigu(k);
		Knjiga k1 = new Knjiga();
		k1.setIsbn(2345);
		biblioteka.obrisiKnjigu(k1);
		assertEquals(1, biblioteka.vratiSveKnjige().size());
		assertTrue(!biblioteka.vratiSveKnjige().contains(k1));
	}
	
	@Test
	void testPronadjiKnjiguNaslov() {
		Knjiga k = new Knjiga();
		k.setIsbn(1234);
		k.setNaslov("Prohujalo sa vihorom");
		biblioteka.dodajKnjigu(k);
		Knjiga k1 = new Knjiga();
		k1.setIsbn(2345);
		k1.setNaslov("Proces");
		biblioteka.dodajKnjigu(k1);
		
		List<Knjiga> rez = biblioteka.pronadjiKnjigu(null, 0, "huj", null);
		assertEquals(1, rez.size());
		assertTrue(rez.contains(k));	
	}
	
	@Test
	void testPronadjiKnjiguNaslov2() {
		Knjiga k = new Knjiga();
		k.setIsbn(1234);
		k.setNaslov("Prohujalo sa vihorom");
		biblioteka.dodajKnjigu(k);
		Knjiga k1 = new Knjiga();
		k1.setIsbn(2345);
		k1.setNaslov("Proces");
		biblioteka.dodajKnjigu(k1);
		
		List<Knjiga> rez = biblioteka.pronadjiKnjigu(null, 0, "pro", null);
		assertEquals(2, rez.size());
		assertTrue(rez.contains(k));
		assertTrue(rez.contains(k1));
	}
		
}
