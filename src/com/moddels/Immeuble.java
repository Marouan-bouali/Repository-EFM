package com.moddels;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;





@Entity
@Table(name="Immeuble")
public class Immeuble {
@Id
@GeneratedValue
@Column(name="num_immeubl")
int id;
@Column
String nb_etage;
}

@OneToMany(mappedBy = "immeuble", fetch = FetchType.LAZY)
List<Rue> rue;
