package de.gzockoll.prototype.entity.roles;

import javax.persistence.Entity;

import de.gzockoll.prototype.entity.Actor;
import de.gzockoll.prototype.entity.ActorRole;

@Entity
public class Promotor extends ActorRole {

	public Promotor(Actor actor) {
		super(actor);
	}

	@Override
	public String getRoleName() {
		return "Promotor";
	}

}
