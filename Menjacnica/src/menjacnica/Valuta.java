package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	private GregorianCalendar datum;
	private double prodajniKurs;
	private double srednjiKurs;
	private double kupovniKurs;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if(naziv.isEmpty()){
			System.out.println("Greska: Uneli ste prazan naziv!");
		}else{
		this.naziv = naziv;
		}
	}
	
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv.isEmpty()){
			System.out.println("Greska: Uneli ste prazan skraceni naziv!");
		}else{
		this.skraceniNaziv = skraceniNaziv;
		}
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		if(datum==null){
			System.out.println("Greska: Uneli ste nedozvoljenu vrednost!");
		}else{
		this.datum = datum;
		}
	}

	public double getProdajniKurs() {
		return prodajniKurs;
	}

	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs<=0){
			System.out.println("Greska: Uneli ste nedozvoljenu vrednost!");
		}else{
		this.prodajniKurs = prodajniKurs;
		}
	}

	public double getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs<=0){
			System.out.println("Greska: Uneli ste nedozvoljenu vrednost!");
		}else{
		this.srednjiKurs = srednjiKurs;
		}
	}

	public double getKupovniKurs() {
		return kupovniKurs;
	}

	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs<=0){
			System.out.println("Greska: Uneli ste nedozvoljenu vrednost!");
		}else{
		this.kupovniKurs = kupovniKurs;
		}
	}

	public String toString() {
		return "Naziv valute: "+naziv+"\n"+"Datum: "+datum+"\n"+"Kupovni kurs: "+kupovniKurs+"\n"
				+"Srednji kurs: "+srednjiKurs+"\n"+"Prodajni kurs: "+prodajniKurs;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	public boolean equals(Object obj) {
		Valuta v1 = (Valuta) obj;
		if(naziv.equals(v1.getNaziv()) && skraceniNaziv.equals(v1.getSkraceniNaziv())
				&& !datum.before(v1.getDatum()) && !datum.after(v1.getDatum())){
			return true;
		}
		return false;
	}
	
}
