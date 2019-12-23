package com.api.APICifo.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tbl_centros")
@Entity
public class Centre {

	//--------------------------------------------Properties----------------------------------------

	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Id
	private int id;
	
	@Column(name="nombre")
	private String name;
	
	@Column(name="buzon")
	private String email;
	
	@Column(name="telefono")
	private String tel;
	
	@Column(name="direccion")
	private String address;
	
	@Column(name="descripcion")
	private String description;
	
	@Column(name="equipamiento")
	private String equipment;
	
	@Column(name="acceso")
	private String access;
	
	@Column(name="horario")
	private String schedule;
	
	private Boolean active;
	
	private String lat;
	
	private String lng;
	
	private String path;
	
	private String file;
	
	private String media;

	
	
	//--------------------------------------------Constructors---------------------------------------

	public Centre() {
		
	}
	
	public Centre(String name, String email, String tel, String address, String description, String equipment,
			String access, String schedule, Boolean active, String lat, String lng, String path, String file,
			String media) {
		this.name = name;
		this.email = email;
		this.tel = tel;
		this.address = address;
		this.description = description;
		this.equipment = equipment;
		this.access = access;
		this.schedule = schedule;
		this.active = active;
		this.lat = lat;
		this.lng = lng;
		this.path = path;
		this.file = file;
		this.media = media;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}
	

}
