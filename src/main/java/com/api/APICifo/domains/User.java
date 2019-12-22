package com.api.APICifo.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tbl_usuarios")
@Entity
public class User {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Id
	private int id;
	
	@Column(name="nombre")
	private String name;
	
	@Column(name="apellidos")
	private String surname;
	
	private String email;
	
	@Column(name="telefon")
	private String tel;
	
	@Column(name="mobil")
	private String mobile;
	
	@Column(name="direccion")
	private String address;
	
	private String password;
	
	@Column(name="foto")
	private String portrait;
	
	private String cv;
	
	//no esta terminada porque hay algunos campos que no se que son

}
