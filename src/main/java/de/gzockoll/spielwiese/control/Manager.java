package de.gzockoll.spielwiese.control;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import de.gzockoll.spielwiese.entity.Actor;

public class Manager extends AbstractManager {

	@Transactional(propagation = Propagation.REQUIRED)
	public void persist(Actor a) {
		dao.save(a);
	}
}
