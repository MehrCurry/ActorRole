/*
 * Actor.java
 *
 * Created on Sep 23, 2007, 4:27:53 PM
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package de.gzockoll.spielwiese.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 * 
 * @author Frank D. Martinez. fmartinez@asimovt.com
 */
@Entity()
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Actor implements Serializable {

	@Id()
	@GeneratedValue()
	protected Integer id;

	@Column()
	protected String commercialName;

	@OneToMany(mappedBy = "actor", cascade = { CascadeType.PERSIST,
			CascadeType.MERGE, CascadeType.REMOVE })
	protected List<ActorRole> roles = new ArrayList<ActorRole>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<ActorRole> getRoles() {
		return roles;
	}

	public void setRoles(List<ActorRole> roles) {
		this.roles = roles;
	}

	public void addRole(ActorRole role) {
		this.roles.add(role);
		role.setActor(this);
	}

	public String getCommercialName() {
		return commercialName;
	}

	public void setCommercialName(String commercialName) {
		this.commercialName = commercialName;
	}

	public ActorRole asRole(String rolename) {

		for (ActorRole r : roles) {
			if (r.getRoleName().equalsIgnoreCase(rolename))
				return r;
		}
		return null;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	protected Address address;
	
}