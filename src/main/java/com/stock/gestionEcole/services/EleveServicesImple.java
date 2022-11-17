package com.stock.gestionEcole.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.gestionEcole.interfaces.EleveRepository;
import com.stock.gestionEcole.models.Eleve;


import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class EleveServicesImple implements EleveServices {
    
	private EleveRepository le;
	
	@Autowired
	EleveServicesImple(EleveRepository le){
		this.le = le;
	}
	@Override
	public Eleve create(Eleve ele) {
		Eleve la = le.save(ele);
	
		return  la;
	}

	@Override
	public Eleve findOneById(Long id) {
		Optional<Eleve> eles =le.findById(id);
		
		return eles.get();
	}

	@Override
	public List<Eleve> findAll() {
		List<Eleve> clas = le.findAll();
		return clas;
	}

	@Override
	public String delete(Long id) {
		le.deleteById(id);
		
		return "suppression de l'eleve avec succès";
	}

}
