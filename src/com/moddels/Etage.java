package com.moddels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Etage")
public class Etage {
@Id
@GeneratedValue
@Column(name="num_Etage")
int id;
@Column
String nb_appartement;

}
