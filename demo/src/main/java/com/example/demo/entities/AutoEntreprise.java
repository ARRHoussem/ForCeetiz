package com.example.demo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//Fils de la class Entreprise pour la catégorie AutoEntreprise
@Entity
@DiscriminatorValue("AE")
public class AutoEntreprise extends Entreprise{

	public AutoEntreprise(Long siretNum, String denomination) {
		super(siretNum, denomination);
		// TODO Auto-generated constructor stub
	}

	public AutoEntreprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
