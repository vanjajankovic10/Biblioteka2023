package bibliotekaTest;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import biblioteka.Biblioteka;
import biblioteka.interfejs.test.BibliotekaInterfejsTest;

class BibliotekaTest extends BibliotekaInterfejsTest{
	@BeforeEach
	void setUp() throws Exception {
		biblioteka = new Biblioteka();
	}
	@AfterEach
	void tearDown() throws Exception {
		biblioteka = null;
	}
}
