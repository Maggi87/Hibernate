package org.hibernate.UserDtl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userId")
	private long userId;
	
	@Column(name="userName")
	private String userName;
	
	@ElementCollection
	@JoinTable(name="EMP_DETAILS",
			joinColumns=@JoinColumn(name="USER_ID")
	)
	private Collection<Address> listofAddress = new ArrayList<Address>();
	
	public Collection<Address> getListofAddress() {
		return listofAddress;
	}

	public void setListofAddress(Collection<Address> listofAddress) {
		this.listofAddress = listofAddress;
	}

	public void setListofAddress(Set<Address> listofAddress) {
		this.listofAddress = listofAddress;
	}
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	
}
