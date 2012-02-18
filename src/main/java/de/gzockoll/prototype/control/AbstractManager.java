package de.gzockoll.prototype.control;

import de.gzockoll.prototype.dao.Dao;

public abstract class AbstractManager {

	protected Dao dao;
	
	public void setDao(Dao dao) {
		this.dao = dao;
	}
}
