/*
 * Organization.java
 * 
 * Created on Sep 23, 2007, 4:36:50 PM
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package de.gzockoll.prototype.entity.actor;

import java.io.Serializable;

import javax.persistence.Entity;

import de.gzockoll.prototype.entity.Actor;

/**
 *
 * @author Frank D. Martinez. fmartinez@asimovt.com
 */
@Entity()
public class Organization extends Actor implements Serializable {

	public Organization(String name) {
		super();
		this.commercialName = name;
	}

	public void setName(String name) {
		this.commercialName = name;
	}
}
