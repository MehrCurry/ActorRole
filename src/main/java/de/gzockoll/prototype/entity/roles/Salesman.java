package de.gzockoll.prototype.entity.roles;

import javax.persistence.Entity;

import de.gzockoll.prototype.entity.Actor;
import de.gzockoll.prototype.entity.ActorRole;

@Entity
public class Salesman extends ActorRole {

	private Dealer dealer;
	
	public Salesman(Actor actor) {
		super(actor);
	}
	
	@Override
	public String getRoleName() {
		return "Salesman";
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	
}
