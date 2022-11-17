package com.stock.gestionEcole.models;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="eleve")

public class Eleve{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
 
	
	@Column(name="matricule") 
	private String matricule;
	
	  
	
	@Column(name="nom") 
	private String nom;
	
	
	
	@Column(name="prenom") 
	private String prenom;
	
	
	
	@Column(name="sexe") 
	private String sexe;
	
	
	
	@Column(name="numero") 
	private String numero;
	
	@ManyToOne
	@JoinColumn(name="classe_id")
	private Classes  classe;

}
