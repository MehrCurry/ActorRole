package de.gzockoll.spielwiese.dao;

import org.springframework.orm.jpa.support.JpaDaoSupport;

import de.gzockoll.spielwiese.entity.Actor;

public class JpaDao extends JpaDaoSupport implements Dao {

	public void save(Actor a) {
		getJpaTemplate().persist(a);
		
	}	

}
