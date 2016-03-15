package menjacnicaInterfejs;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface Menjacnica {
	public void dodavanjeKursaValute(String naziv, String skraceniNaziv, GregorianCalendar datum, 
									 double srednjiKurs, double kupovniKurs, double prodajniKurs);
	public void brisanjeKursaValute(String naziv, String skraceniNaziv, GregorianCalendar datum);
	public Valuta pronadjiKurs(String naziv, String skraceniNaziv, GregorianCalendar datum);
}
