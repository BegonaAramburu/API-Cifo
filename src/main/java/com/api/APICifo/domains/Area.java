package com.api.APICifo.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tbl_areas")
@Entity
public class Area {
	
	//--------------------------------------------Properties----------------------------------------
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Id
	private int id;
	
	@Column(name="nombre")
	private String name;
	
	@Column(name="descripcion")
	private String description;
	
	private Boolean active;
	
	//--------------------------------------------Constructors---------------------------------------

	public Area() {
		
	}
	
	public Area(String name, String description, Boolean active) {
		this.name = name;
		this.description = description;
		this.active = active;
	}
	
	//--------------------------------------------Get/Set---------------------------------------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	

}
