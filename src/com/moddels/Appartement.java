package com.moddels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Appartement")
public class Appartement {
	@Id
	@GeneratedValue
	@Column(name="lettre_appartement")
	String id;
	@Column
	int nb_piece;

}
