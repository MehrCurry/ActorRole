package de.gzockoll.prototype.control;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import de.gzockoll.prototype.entity.Actor;

public interface Manger {

	@Transactional(propagation = Propagation.REQUIRED)
	public abstract void persist(Actor a);

}