package biblioteka;

import java.util.Objects;
/**
 * Predstavlja autora knjige.
 * 
 * Autor ima ime i prezime.
 * 
 * 
 * @author Vanja Jankovic
 * @since 0.1.0
 */
public class Autor {
	/**
	 * Ime autora kao String.
	 */
	private String ime;
	/**
	 * Prezime autora kao String.
	 */
	private String prezime;
	/**
	 * Kreira novog autora bez dodavanja imena i prezimena.
	 */
	public Autor() {
	
	}
	/**
	 * Kreira novog autora i dodeljuje ime i prezime
	 * @param ime novo ime autora 
	 * @param prezime novo prezime autora
	 */
	public Autor(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}
	/**
	 * Vraca ime autora.
	 * 
	 * @return ime autora kao String
	 */
	public String getIme() {
		return ime;
	}
	/**
	 * Postavlja ime autora.
	 * 
	 * Ime autora ne sme biti null ili prazan String.
	 * 
	 * @param ime nova vrednost za ime autora
	 * 
	 * @throws NullPointerException ako se unese null vrednost za ime
	 * @throws IllegalArgumentException ako se unese prazan String za ime
	 */
	public void setIme(String ime) {
		if(ime == null) {
			throw new NullPointerException("Ime ne sme biti null");
		}
		if(ime.isEmpty()) {
			throw new IllegalArgumentException("Ime ne sme biti prazno polje");
		}
		this.ime = ime;
	}
	/**
	 * Vraca prezime autora.
	 * 
	 * @return prezime autora kao String
	 */
	public String getPrezime() {
		return prezime;
	}
	/**
	 * Postavlja prezime autora.
	 * 
	 * Prezime autora ne sme biti null ili prazan String 
	 * 
	 * @param prezime novo prezime autora
	 * 
	 * @throws NullPointerException ako se unese null vrednost za prezime
	 * @throws IllegalArgumentException ako se unese prazan String za prezime
	 */
	public void setPrezime(String prezime) {
		if(prezime == null) {
			throw new NullPointerException("Prezime ne sme biti null");
		}
		if(prezime.isEmpty()) {
			throw new IllegalArgumentException("Prezime ne sme biti prazno polje");
		}
		this.prezime = prezime;
	}
	@Override
	public String toString() {
		return  ime + ", " + prezime;
	}
	/**
	 * Racuna hash code na osnovu imena i prezimena autora
	 * 
	 * @return hash code izracunat na osnovu imena i prezimena
	 */
	public int hashCode() {
		return Objects.hash(ime, prezime);
	}
	/**
	 * Poredi dva autora prema imenu i prezimenu
	 * 
	 * @return
	 * <ul>
	 * 		<li>true - ako je uneti isti objekat ili imaju isto ime i prezime</li>
	 * 		<li>false - ako je unet null objekat ili ako nije klase Autor ili ako su im ime i/ili prezime razliciti</li>
	 * </ul>
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(ime, other.ime) && Objects.equals(prezime, other.prezime);
	}
	
	
}
