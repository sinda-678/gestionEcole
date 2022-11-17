package com.stock.gestionEcole.controlleurs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.stock.gestionEcole.models.Classes;
import com.stock.gestionEcole.services.ClassesServices;

@RestController
public class ClassesControlleurImple implements ClassesControlleurApi  {
	
	private  ClassesServices son;
	
	@Autowired
	 ClassesControlleurImple( ClassesServices son){
		this.son = son;
	}
	
	@Override
	public Classes create(Classes ele) {
		// TODO Auto-generated method stub
		return son.create(ele);
	}

	@Override
	public Classes findOneById(Long id) {
		// TODO Auto-generated method stub
		return son.findOneById(id);
	}

	@Override
	public List<Classes> findAll() {
		// TODO Auto-generated method stub
		return son.findAll();
	}

	@Override
	public String delete(Long id) {
		// TODO Auto-generated method stub
		return son.delete(id);
	}

}
