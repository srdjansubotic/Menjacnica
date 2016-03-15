package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnicaInterfejs.Menjacnica;

public class Promena implements Menjacnica {
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	
	public void dodavanjeKursaValute(String naziv, String skraceniNaziv, GregorianCalendar datum, double srednjiKurs,
			double kupovniKurs, double prodajniKurs) {
		
		
		Valuta v1 = new Valuta();
		v1.setDatum(datum);
		v1.setKupovniKurs(kupovniKurs);
		v1.setNaziv(naziv);
		v1.setSkraceniNaziv(skraceniNaziv);
		v1.setProdajniKurs(prodajniKurs);
		v1.setSrednjiKurs(srednjiKurs);
		boolean unet=false;
		for(int i=0;i<valute.size();i++){
			if(valute.get(i).equals(v1)){
				valute.get(i).setSrednjiKurs(srednjiKurs);
				valute.get(i).setKupovniKurs(kupovniKurs);
				valute.get(i).setProdajniKurs(prodajniKurs);
				unet=true;
				break;
			}
		}
		if(!unet){
			valute.add(v1);
		}
	}

	
	public void brisanjeKursaValute(String naziv, String skraceniNaziv, GregorianCalendar datum) {
		Valuta v1 = new Valuta();
		v1.setDatum(datum);
		v1.setNaziv(naziv);
		v1.setSkraceniNaziv(skraceniNaziv);
		for(int i=0;i<valute.size();i++){
			if(valute.get(i).equals(v1)){
				valute.get(i).setSrednjiKurs(0);
				valute.get(i).setKupovniKurs(0);
				valute.get(i).setProdajniKurs(0);
				break;
			}
		}
	}

	
	public Valuta pronadjiKurs(String naziv, String skraceniNaziv, GregorianCalendar datum) {
		Valuta v1 = new Valuta();
		v1.setDatum(datum);
		v1.setNaziv(naziv);
		v1.setSkraceniNaziv(skraceniNaziv);
		for(int i=0;i<valute.size();i++){
			if(valute.get(i).equals(v1)){
				return v1;
			}
		}
		return null;
	}

}
