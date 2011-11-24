package de.gzockoll.spielwiese.entity.roles;

import javax.persistence.Entity;

import de.gzockoll.spielwiese.entity.Actor;
import de.gzockoll.spielwiese.entity.ActorRole;

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
