package de.gzockoll.prototype.actorrole.api;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import de.gzockoll.prototype.actorrole.entity.Actor;

public interface Manager {

	@Transactional(propagation = Propagation.REQUIRED)
	public abstract void persist(Actor a);

}