package de.gzockoll.spielwiese.entity.roles;

import javax.persistence.Entity;

import de.gzockoll.spielwiese.entity.Actor;
import de.gzockoll.spielwiese.entity.ActorRole;

@Entity
public class Agency extends ActorRole {

	public Agency(Actor actor) {
		super(actor);
	}

}
