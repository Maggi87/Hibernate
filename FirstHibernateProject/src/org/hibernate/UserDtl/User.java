package org.hibernate.UserDtl;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id") 
	private long uid;
	
	@Column(name="name")
	private String uname;
	
	@Column(name="joinDate")
	@Temporal(TemporalType.DATE)
	private Date joinDate;
	
 	@Embedded
 	@AttributeOverrides({
 	@AttributeOverride(name="street", column=@Column(name="Home_street_name")),
 	@AttributeOverride(name="city",   column=@Column(name="Home_city_name")),
 	@AttributeOverride(name="state",  column=@Column(name="Home_state_name")),
 	@AttributeOverride(name="pincode",column=@Column(name="Home_pin_code")) 	
 	})
	private Address homeaddress;
	
	@Embedded
	private Address officeaddresd;
	
	@Column(name="description")
	@Lob
	private String description;

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Address getHomeaddress() {
		return homeaddress;
	}

	public void setHomeaddress(Address homeaddress) {
		this.homeaddress = homeaddress;
	}

	public Address getOfficeaddresd() {
		return officeaddresd;
	}

	public void setOfficeaddresd(Address officeaddresd) {
		this.officeaddresd = officeaddresd;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
