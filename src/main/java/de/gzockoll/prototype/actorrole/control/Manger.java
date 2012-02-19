package de.gzockoll.prototype.actorrole.control;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import de.gzockoll.prototype.actorrole.entity.Actor;

public interface Manger {

	@Transactional(propagation = Propagation.REQUIRED)
	public abstract void persist(Actor a);

}