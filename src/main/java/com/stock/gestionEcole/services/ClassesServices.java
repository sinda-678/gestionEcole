package com.stock.gestionEcole.services;

import java.util.List;

import com.stock.gestionEcole.models.Classes;
import com.stock.gestionEcole.models.Eleve;

public interface ClassesServices {

	Classes create(Classes cla);
	
	Classes findOneById(Long id);
	
	List<Classes> findAll();
	
	String delete(Long id);
}