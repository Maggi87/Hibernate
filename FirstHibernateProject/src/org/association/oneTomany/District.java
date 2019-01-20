package org.association.oneTomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Destrict")
public class District {
	
	@Id
	@Column(name="dis")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="dname")
	private String dname;
	
	@ManyToOne
	private State state;
	public State getState() {
		return state; 
	}
	public void setState(State state) {
		this.state = state;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
	
	

}
