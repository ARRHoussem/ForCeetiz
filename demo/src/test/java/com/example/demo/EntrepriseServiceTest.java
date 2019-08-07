package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.services.EntrepriseService;

public class EntrepriseServiceTest {
	@Autowired
	private EntrepriseService entrepriseService;
	//test calcul impo
	@Test
	public void CalculImpoTest() {
		float result = entrepriseService.CalculImpo(1111L, 100);
		assertEquals(25, result, 0);
	}

}
