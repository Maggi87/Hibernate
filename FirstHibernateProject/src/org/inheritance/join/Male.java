package org.inheritance.join;

import javax.persistence.Entity;

@Entity
public class Male extends Human{

	private String male;

	public String getMale() {
		return male;
	}

	public void setMale(String male) {
		this.male = male;
	}

	
}
