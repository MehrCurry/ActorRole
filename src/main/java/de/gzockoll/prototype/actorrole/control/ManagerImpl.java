package de.gzockoll.prototype.actorrole.control;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import de.gzockoll.prototype.actorrole.api.Manager;
import de.gzockoll.prototype.actorrole.entity.Actor;

@Service
@Transactional
public class ManagerImpl extends AbstractManager implements Manager {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.gzockoll.prototype.control.Manger#persist(de.gzockoll.prototype.entity
	 * .Actor)
	 */
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void persist(Actor a) {
		em.persist(a);
	}
}
