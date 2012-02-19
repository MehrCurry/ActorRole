package de.gzockoll.prototype.actorrole.entity.roles;

import javax.persistence.Entity;

import de.gzockoll.prototype.actorrole.entity.Actor;
import de.gzockoll.prototype.actorrole.entity.ActorRole;

@Entity
public class Agency extends ActorRole {

	public Agency(Actor actor) {
		super(actor);
	}

}
