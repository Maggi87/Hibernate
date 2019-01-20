package org.hibernate.manyTomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Customers ")
public class Customers {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="c_id")
	private long id;
	
	@Column(name="c_name")
	private String name;
	
	@ManyToMany(mappedBy="cust")	
	private Collection<Banks> bank = new ArrayList();
	public Collection<Banks> getBank() {
		return bank;
	}
	public void setBank(Collection<Banks> bank) {
		this.bank = bank;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
