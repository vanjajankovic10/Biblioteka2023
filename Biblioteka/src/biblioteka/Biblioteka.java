package biblioteka;

import java.util.List;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	List<Knjiga> knjige;
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		// TODO Auto-generated method stub

	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Knjiga> vratiSveKnjige() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac) {
		if (autor==null && isbn<=0 && naslov==null && izdavac==null)
			return knjige;
		
		return null;
	}

}
