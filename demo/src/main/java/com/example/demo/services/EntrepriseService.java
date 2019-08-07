package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public interface EntrepriseService {
	public float CalculImpo (Long Siret,float CA);
}
