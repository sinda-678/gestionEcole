package com.stock.gestionEcole.controlleurs;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.gestionEcole.models.Classes;


@RequestMapping("/api/cla")
public interface ClassesControlleurApi {

	  @PostMapping("/creer")
		Classes create(@RequestBody Classes ele);
		
	     @GetMapping("/one/{id}")
		Classes findOneById(@PathVariable("id") Long id);
		
	     @GetMapping("/tout")
		List<Classes> findAll();
		
	     @DeleteMapping("/supp/{id}")
		String delete(Long id);  

}
