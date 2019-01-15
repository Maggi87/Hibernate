package org.hibernate.oneTomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Country")
public class Country {
	
	@Id
	@Column(name="cid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long cid;
	
	@Column(name="cname")
	private String name;
	
	@OneToMany
	@JoinTable(name="country_state", joinColumns=@JoinColumn(name="cid"),
									 inverseJoinColumns=@JoinColumn(name="sid"))
	private Collection<State> state = new ArrayList<State>();
	
	public Collection<State> getState() {
		return state;
	}
	public void setState(Collection<State> state) {
		this.state = state;
	}
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
