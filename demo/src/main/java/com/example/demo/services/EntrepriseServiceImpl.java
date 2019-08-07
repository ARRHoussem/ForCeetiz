package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EntrepriseRepository;
import com.example.demo.entities.AutoEntreprise;
import com.example.demo.entities.Entreprise;

@Service
public class EntrepriseServiceImpl implements EntrepriseService {
	@Autowired
	private EntrepriseRepository entrepiseRepository;
	@Override
	public float CalculImpo(Long Siret, float CA) {
		float impot = 0;
		Entreprise entreprise = entrepiseRepository.findEntrepriseBySiretNum(Siret);
		if(entreprise.getClass().equals(AutoEntreprise.class)) {
			impot = (CA/100)* ServicesConstants.IMPOT_AE;
		}
		else {impot =(CA/100)* ServicesConstants.IMPOT_SAS;}
		return impot;
	}
	

}
