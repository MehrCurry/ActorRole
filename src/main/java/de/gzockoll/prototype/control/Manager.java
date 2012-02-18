package de.gzockoll.prototype.control;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import de.gzockoll.prototype.entity.Actor;

@Service
public class Manager extends AbstractManager {

	@Transactional(propagation = Propagation.REQUIRED)
	public void persist(Actor a) {
		em.persist(a);
	}
}
