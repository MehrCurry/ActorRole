package de.gzockoll.prototype.actorrole.control;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractManager {

	@PersistenceContext
	protected EntityManager em;

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public EntityManager getEm() {
		return em;
	}
}
