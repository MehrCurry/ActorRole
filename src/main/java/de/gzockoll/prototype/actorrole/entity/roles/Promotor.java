package de.gzockoll.prototype.actorrole.entity.roles;

import javax.persistence.Entity;

import de.gzockoll.prototype.actorrole.entity.Actor;
import de.gzockoll.prototype.actorrole.entity.ActorRole;

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
