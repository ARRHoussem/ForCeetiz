package com.example.demo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//Fils de la class Entreprise pour la catégorie SAS
@Entity
@DiscriminatorValue("SAS")
public class Sas extends Entreprise{
	

	private String adressSS;
	public String getAdressSS() {
		return adressSS;
	}

	public void setAdressSS(String adressSS) {
		this.adressSS = adressSS;
	}

	public Sas(Long siretNum, String denomination, String adressSS) {
		super(siretNum, denomination);
		this.adressSS = adressSS;
	}

	public Sas() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
