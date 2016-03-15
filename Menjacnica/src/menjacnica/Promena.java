package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnicaInterfejs.Menjacnica;

public class Promena implements Menjacnica {
	
	private LinkedList<Valuta> listaValuta = new LinkedList<Valuta>();
	
	public void dodavanjeKursaValute(String naziv, String skraceniNaziv, GregorianCalendar datum, double srednjiKurs,
			double kupovniKurs, double prodajniKurs) {
		
		Valuta valuta1 = new Valuta();
		valuta1.setProdajniKurs(prodajniKurs);
		valuta1.setKupovniKurs(kupovniKurs);
		valuta1.setSrednjiKurs(srednjiKurs);
		valuta1.setNaziv(naziv);
		valuta1.setSkraceniNaziv(skraceniNaziv);
		valuta1.setDatum(datum);
		int i=0;
		while(i<listaValuta.size()){
			if(listaValuta.get(i).equals(valuta1)){
				listaValuta.get(i).setSrednjiKurs(srednjiKurs);
				listaValuta.get(i).setKupovniKurs(kupovniKurs);
				listaValuta.get(i).setProdajniKurs(prodajniKurs);
				break;
			}
			i++;
		}

	}

	
	public void brisanjeKursaValute(String naziv, String skraceniNaziv, GregorianCalendar datum) {
		

	}

	
	public Valuta pronadjiKurs(String naziv, String skraceniNaziv, GregorianCalendar datum) {
		
		return null;
	}

}
