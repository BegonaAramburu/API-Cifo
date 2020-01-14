package com.api.APICifo.domains;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "tbl_ofertas")
@Entity
public class Offer {
	
	//--------------------------------------------Properties----------------------------------------

	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Id
	private Integer id;
	
	@Column(name="codigoferta")
	private String offerCode;
	
	@Column(name="datainicio")
	private Date startDate;
	
	@Column(name="datafin")
	private Date endDate;
	
	@Column(name="horario")
	private String schedule;
	
	@Column(name="plazas")
	private int places;
	
	private Boolean active;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_centros")
	private Center centre;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_cursos")
	private Course course;

	//--------------------------------------------Constructors---------------------------------------

	public Offer() {

	}

	public Offer(String offerCode, Date startDate, Date endDate, String schedule, int places, Boolean active,
			Center centre, Course course) {
		this.offerCode = offerCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.schedule = schedule;
		this.places = places;
		this.active = active;
		this.centre = centre;
		this.course = course;
	}

	//--------------------------------------------Get/Set---------------------------------------
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public int getPlaces() {
		return places;
	}

	public void setPlaces(int places) {
		this.places = places;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Center getCentre() {
		return centre;
	}

	public void setCentre(Center centre) {
		this.centre = centre;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	
	

}
