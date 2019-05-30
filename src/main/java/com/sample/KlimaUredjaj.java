package com.sample;

public class KlimaUredjaj {
	
	//Pravila 9 i 10 navode da je preporuceni tip "zidna" klima, osim u 
	//nekim slucajevima pa se to postavlja za pocetnu vrednost atributa tip
	private String tip = "zidna";
	private int snaga;
	private boolean imaInverter;
	
	private int kvadratura;
	private String brojProstorija;
	private boolean mogucaUgradnjaNaZid;
	private boolean podjednakoZaGrejanje;
	private boolean radNaNiskimTemperaturama;
	
	public String getTip() {
		return tip;
	}
	
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	public int getSnaga() {
		return snaga;
	}
	
	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}
	
	public boolean isImaInverter() {
		return imaInverter;
	}
	
	public void setImaInverter(boolean imaInverter) {
		this.imaInverter = imaInverter;
	}
	
	public int getKvadratura() {
		return kvadratura;
	}
	
	public void setKvadratura(int kvadratura) {
		this.kvadratura = kvadratura;
	}
	
	public String getBrojProstorija() {
		return brojProstorija;
	}
	
	public void setBrojProstorija(String brojProstorija) {
		this.brojProstorija = brojProstorija;
	}
	
	public boolean isMogucaUgradnjaNaZid() {
		return mogucaUgradnjaNaZid;
	}
	
	public void setMogucaUgradnjaNaZid(boolean mogucaUgradnjaNaZid) {
		this.mogucaUgradnjaNaZid = mogucaUgradnjaNaZid;
	}
	
	public boolean isPodjednakoZaGrejanje() {
		return podjednakoZaGrejanje;
	}
	
	public void setPodjednakoZaGrejanje(boolean podjednakoZaGrejanje) {
		this.podjednakoZaGrejanje = podjednakoZaGrejanje;
	}
	
	public boolean isRadNaNiskimTemperaturama() {
		return radNaNiskimTemperaturama;
	}
	
	public void setRadNaNiskimTemperaturama(boolean radNaNiskimTemperaturama) {
		this.radNaNiskimTemperaturama = radNaNiskimTemperaturama;
	}

	//Trazi se samo ispis resenja a ne i ulaznih cinjenica, tako da toString vraca
	//tip, snagu i da li ima inverter
	@Override
	public String toString() {
		return "KlimaUredjaj [tip=" + tip + ", snaga=" + snaga + ", imaInverter=" + imaInverter + "]";
	}
	
	

}
