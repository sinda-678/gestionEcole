package com.stock.gestionEcole.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.gestionEcole.models.Eleve;



public interface EleveRepository  extends JpaRepository<Eleve, Long> {

}
