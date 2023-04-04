package biblioteka.interfejs;

import java.util.List;

import biblioteka.Autor;
import biblioteka.Knjiga;
/**
 * Predstavlja biblioteku u koju mogu da se dodaju, brisu i pretrazuju knjige.
 * 
 * @author Vanja Jankovic
 * @since 0.9.0
 *
 */
public interface BibliotekaInterfejs {
	/**
	 * Dodaje knjigu u biblioteku
	 * 
	 * Knjiga ne sme biti null i ne sme biti duplikat.
	 * 
	 * @param knjiga nova knjiga koja se unosi u biblioteku
	 * 
	 * @throws NullPointerException ako se doda knjiga koja je null
	 * @throws IllegalArgumentException ako se doda duplikat knjiga
	 */
	public void dodajKnjigu(Knjiga knjiga);
	/**
	 * Brise knjigu iz biblioteke.
	 * 
	 * @param knjiga knjiga koju treba obrisati iz biblioteke
	 */
	public void obrisiKnjigu(Knjiga knjiga);
	/**
	 * Vraca sve knjige iz biblioteke.
	 * 
	 * @return lista sa svim knjigama iz biblioteke
	 */
	public List<Knjiga> vratiSveKnjige();
	/**
	 * Pretrazuje biblioteku i pronalazi knjige koje odgovaraju kriterijumima pretrage.
	 * 
	 * Pretrazivanje se radi prema svim unetim kriterijumima, a oni koji imaju pocetne null vrednosti
	 * (i -1 za isbn) se preskacu u pretrazi.
	 * 
	 * @param autor jedan od autora knjige ili null vrednost ukoliko se preskace u pretrazi
	 * @param isbn isbn broj knjige ili -1 ukoliko se preskace u pretrazi
	 * @param naslov naslov knjige ili null vrednost ukoliko se preskace u pretrazi
	 * @param izdavac izdavac knjige ili null vrednost ukoliko se preskace u pretrazi
	 * @throws IllegalArgumentException ukoliko nije unet nijedan kriterijum pretrage
	 * @return lista knjiga iz biblioteke koje odgovaraju kriterijumima pretrage
	 * 
	 */
	public List<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac);
	
	
	
}
