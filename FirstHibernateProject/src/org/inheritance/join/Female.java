package org.inheritance.join;

import javax.persistence.Entity;

@Entity
public class Female extends Human{

	private String female;

	public String getFemale() {
		return female;
	}

	public void setFemale(String female) {
		this.female = female;
	}
	
	
	
}
