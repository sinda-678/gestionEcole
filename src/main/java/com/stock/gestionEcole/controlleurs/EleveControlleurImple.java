package com.stock.gestionEcole.controlleurs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.stock.gestionEcole.models.Eleve;
import com.stock.gestionEcole.services.EleveServices;
import com.stock.gestionEcole.services.EleveServicesImple;

@RestController
public class EleveControlleurImple implements  EleveControlleurApi {
	
	 private  EleveServices ma;
	
	 @Autowired
	 EleveControlleurImple( EleveServices ma){
		 this.ma = ma;
	 }
	 
	@Override
	public Eleve create(Eleve ele) {
		// TODO Auto-generated method stub
		return ma.create(ele);
	}

	@Override
	public Eleve findOneById(Long id) {
		// TODO Auto-generated method stub
		return ma.findOneById(id);
	}

	@Override
	public List<Eleve> findAll() {
		// TODO Auto-generated method stub
		return ma.findAll();
	}

	@Override
	public String delete(Long id) {
		// TODO Auto-generated method stub
		return ma.delete(id);
	}

}
