/*
 * ActorRole.java
 * 
 * Created on Sep 23, 2007, 4:28:14 PM
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package de.gzockoll.prototype.actorrole.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

/**
 * 
 * @author Frank D. Martinez. fmartinez@asimovt.com
 */
@Entity()
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ActorRole implements Serializable {

	@Id()
	@GeneratedValue()
	protected Integer id;

	@ManyToOne()
	protected Actor actor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public String getCommercialName() {
		return actor == null ? null : actor.getCommercialName();
	}

	public ActorRole(Actor actor) {
		this.actor = actor;
		actor.addRole(this);
	}

	public String getRoleName() {
		return getClass().getSimpleName();
	}

}
