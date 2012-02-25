package de.gzockoll.prototype.actorrole.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Address implements Serializable {

    public Address() {
    }
	public Address(String strasse, String hausnummer, String plz, String ort) {
		this.strasse=strasse;
		this.hausnummer=hausnummer;
		this.plz=plz;
		this.ort=ort;
	}
	
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	private String plz;
	private String ort;
	private String strasse;
	private String hausnummer;
}
