package com.stock.gestionEcole.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import com.stock.gestionEcole.models.Classes;



public interface ClasseRepository  extends JpaRepository<Classes, Long>{

}
