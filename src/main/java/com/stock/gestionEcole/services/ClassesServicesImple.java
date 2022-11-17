package com.stock.gestionEcole.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.gestionEcole.interfaces.ClasseRepository;
import com.stock.gestionEcole.models.Classes;
import com.stock.gestionEcole.models.Eleve;


import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ClassesServicesImple  implements  ClassesServices{

	
		private ClasseRepository js;
		
		@Autowired
		ClassesServicesImple( ClasseRepository js){
			this.js =js;
		}
	@Override
	public Classes create(Classes cla) {
		Classes cate =js.save(cla);
		
		return cate;
	}

	@Override
	public Classes findOneById(Long id) {
		Optional<Classes> classess =js.findById(id);
		return classess.get();
	}

	@Override
	public List<Classes> findAll() {
		List<Classes> clas = js.findAll();
		return clas;
	}

	@Override
	public String delete(Long id) {
	js.deleteById(id);
		return "la classe a été supprimé avec succès";
	}

}
