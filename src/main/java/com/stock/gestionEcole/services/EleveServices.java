package com.stock.gestionEcole.services;

import java.util.List;

import com.stock.gestionEcole.models.Eleve;


public interface EleveServices {
	
	Eleve create(Eleve ele);
	
	Eleve findOneById(Long id);
	
	List<Eleve> findAll();
	
	String delete(Long id);  


}
