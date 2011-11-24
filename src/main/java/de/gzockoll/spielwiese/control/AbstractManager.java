package de.gzockoll.spielwiese.control;

import de.gzockoll.spielwiese.dao.Dao;

public abstract class AbstractManager {

	protected Dao dao;
	
	public void setDao(Dao dao) {
		this.dao = dao;
	}
}
