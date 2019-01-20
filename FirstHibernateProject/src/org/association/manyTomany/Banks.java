package org.association.manyTomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Banks")
public class Banks {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="b_id")
	private long id;
	
	@Column(name="b_name")
	private String name;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="bank_customer", joinColumns=@JoinColumn(name="bid"),inverseJoinColumns=@JoinColumn(name="cid"))
	private Collection<Customers> cust = new ArrayList<Customers>();
	
	public Collection<Customers> getCust() {
		return cust;
	}
	public void setCust(Collection<Customers> cust) {
		this.cust = cust;
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
