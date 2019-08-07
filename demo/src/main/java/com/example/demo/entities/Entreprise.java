package com.example.demo.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

//Class Parent Entreprise 

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_ENTR",discriminatorType=DiscriminatorType.STRING,length=3)
public class Entreprise {

	@Id
	private Long siretNum;
	private String denomination;
	
	public Long getSiretNum() {
		return siretNum;
	}
	public void setSiretNum(Long siretNum) {
		this.siretNum = siretNum;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public Entreprise(Long siretNum, String denomination) {
		super();
		this.siretNum = siretNum;
		this.denomination = denomination;
	}
	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
