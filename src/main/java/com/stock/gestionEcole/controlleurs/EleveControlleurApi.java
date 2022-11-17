package com.stock.gestionEcole.controlleurs;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.gestionEcole.models.Eleve;

@RequestMapping("/api/ele")
public interface EleveControlleurApi {
	
     @PostMapping("/crer")
	Eleve create(@RequestBody Eleve ele);
	
     @GetMapping("/one/{id}")
	Eleve findOneById(@PathVariable("id") Long id);
	
     @GetMapping("/tout")
	List<Eleve> findAll();
	
     @DeleteMapping("/supp/{id}")
	String delete(Long id);  


}
