package biblioteka;

import java.util.List;
import java.util.Objects;
/**
 * Predstavlja elektronsku ili stampanu knjigu.
 * 
 * Sastoji se iz naslova, jednog ili vise autora, izdavaca, izdanja
 * 
 * @author Vanja Jankovic
 * @since 0.9.0
 *
 */
public class Knjiga {
	/**
	 * Naslov knjige kao String.
	 */
	private String naslov;
	/**
	 * Isbn broj knjige.
	 * 
	 * @see <a href="https://sr.wikipedia.org/wiki/Me%C4%91unarodni_standardni_knji%C5%BEni_broj">ISBN Wikipedia</a>
	 */
	private long isbn;
	/**
	 * Lista autora knjige.
	 * 
	 * Moze biti prazna ili null u slucaju kad su nepoznati autori knjige.
	 * Moze sadrzati jednog ili vise autora.
	 */
	private List<Autor> autori;
	/**
	 * Naziv izdavaca knjige kao String.
	 */
	private String izdavac;
	/**
	 * Broj izdanja knjige kao ceo broj.
	 */
	private int izdanje;
	/**
	 * Vraca naslov knjige kao String.
	 * 
	 * @return naslov knjige kao String
	 */
	public String getNaslov() {
		return naslov;
	}
	/**
	 * Postavlja naslov knjige.
	 * 
	 * @param naslov naslov knjige
	 * 
	 * @throws NullPointerException ako je naslov knjige null
	 * @throws IllegalArgumentException ako je naslov knjige prazan String
	 */
	public void setNaslov(String naslov) {
		if(naslov == null) {
			throw new NullPointerException("Naslov ne sme biti null");
		}
		if(naslov.isEmpty()) {
			throw new IllegalArgumentException("Naslov ne sme biti prazan");
		}
		this.naslov = naslov;
	}
	/**
	 * Vraca isbn broj knjige.
	 * 
	 * @return isbn broj knjige kao ceo broj
	 */
	public long getIsbn() {
		return isbn;
	}
	/**
	 * Postavlja isbn broj knjige.
	 * 
	 * Isbn broj mora biti veci od nule.
	 * 
	 * @param isbn isbn broj knjige
	 * 
	 * @throws IllegalArgumentException ako je unet isbn broj manji od 1
	 */
	public void setIsbn(long isbn) {
		if(isbn <= 0) {
			throw new IllegalArgumentException("ISBN mora biti veci od 0");
		}
		this.isbn = isbn;
	}
	/**
	 * Vraca autore knjige.
	 * 
	 * @return lista autora knjige ili null ukoliko su autori nepoznati
	 */
	public List<Autor> getAutori() {
		return autori;
	}
	/**
	 * Postavlja autore knjige.
	 * 
	 * @param autori lista sa autorima knjige
	 */
	public void setAutori(List<Autor> autori) {
		this.autori = autori;
	}
	/**
	 * Vraca naziv izdavaca knjige kao String.
	 * 
	 * @return naziv izdavaca knjige kao String
	 */
	public String getIzdavac() {
		return izdavac;
	}
	/**
	 * Postavlja naziv izdavaca knjige.
	 * 
	 * Naziv izdavaca knjige ne sme biti null niti prazan String.
	 * 
	 * @param izdavac naziv izdavaca knjige
	 * 
	 * @throws NullPointerException ako je prosledjeni naziv izdavaca null
	 * @throws IllegalArgumentException ako je prosledjeni naziv izdavaca prazan String
	 */
	public void setIzdavac(String izdavac) {
		if(izdavac == null) {
			throw new NullPointerException("Knjiga mora imati izdavaca");
		}
		if(izdavac.isEmpty()) {
			throw new IllegalArgumentException("Izdavac knjige ne sme biti prazno polje");
		}
		this.izdavac = izdavac;
	}
	/**
	 * Vraca izdanje knjige kao ceo broj.
	 *	
	 * @return izdanje knjige kao ceo broj
	 */
	public int getIzdanje() {
		return izdanje;
	}
	/**
	 * Postavlja broj izdanja knjige.
	 * 
	 * Broj izdanja knjige ne sme biti manji od 1.
	 * 
	 * @param izdanje broj izdanja knjige
	 * 
	 * @throws IllegalArgumentException ako je prosledjeno izdanje manje od 1
	 */
	public void setIzdanje(int izdanje) {
		if(izdanje < 1){
			throw new IllegalArgumentException("Izdanje mora biti vece od 0");
		}
		this.izdanje = izdanje;
	}
	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", isbn=" + isbn + ", autori=" + autori + ", izdavac=" + izdavac
				+ ", izdanje=" + izdanje + "]";
	}
	/**
	 * Racuna hash code na osnovu isbn broja knjige.
	 * 
	 * @return hash code na osnovu isbn broja knjige
	 */
	public int hashCode() {
		return Objects.hash(isbn);
	}
	/**
	 * Poredi dve knjige po isbn broju knjige.
	 * 
	 * @return
	 * <ul>
	 * 		<li>true - ako je prosledjena ista knjiga ili ako je isbn broj obe knjige isti</li>
	 * 		<li>false - ako je unet null objekat ili objekat koji ne pripada klasi Knjiga ili ako su im isbn brojevi razliciti</li>
	 * </ul>
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		return isbn == other.isbn;
	}
	
	
	
	
}
