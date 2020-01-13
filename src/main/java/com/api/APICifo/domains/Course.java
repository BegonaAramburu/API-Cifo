package com.api.APICifo.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "tbl_cursos")
@Entity
public class Course {
	
	//--------------------------------------------Properties----------------------------------------
	
		@GeneratedValue(strategy=GenerationType.IDENTITY)	
		@Id
		private Integer id;
		
		@Column(name="nombre")
		private String name;
		
		@Column(name="objetivos")
		private String objective;
		
		@Column(name="programa")
		private String program;
		
		@Column(name="duracion")
		private String duration;
		
		private Boolean active;

		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name="id_areas")
		private Area area;

		
		//--------------------------------------------Constructors---------------------------------------

		
		public Course() {
		
		}
		
		public Course(String name, String objective, String program, String duration, Boolean active, Area area) {
			this.name = name;
			this.objective = objective;
			this.program = program;
			this.duration = duration;
			this.active = active;
			this.area = area;
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

		public String getObjective() {
			return objective;
		}

		public void setObjective(String objective) {
			this.objective = objective;
		}

		public String getProgram() {
			return program;
		}

		public void setProgram(String program) {
			this.program = program;
		}

		public String getDuration() {
			return duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public Boolean getActive() {
			return active;
		}

		public void setActive(Boolean active) {
			this.active = active;
		}

		public Area getArea() {
			return area;
		}

		public void setArea(Area area) {
			this.area = area;
		}
	
		
		
		

}
