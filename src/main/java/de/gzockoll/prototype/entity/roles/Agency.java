package de.gzockoll.prototype.entity.roles;

import javax.persistence.Entity;

import de.gzockoll.prototype.entity.Actor;
import de.gzockoll.prototype.entity.ActorRole;

@Entity
public class Agency extends ActorRole {

	public Agency(Actor actor) {
		super(actor);
	}

}
