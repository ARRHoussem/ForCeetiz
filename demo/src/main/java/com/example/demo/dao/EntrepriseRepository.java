package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Entreprise;
@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {
	
	public Entreprise findEntrepriseBySiretNum(Long Siret);
}
