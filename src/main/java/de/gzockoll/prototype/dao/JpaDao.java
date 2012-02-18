package de.gzockoll.prototype.dao;

import org.springframework.orm.jpa.support.JpaDaoSupport;

import de.gzockoll.prototype.entity.Actor;

public class JpaDao extends JpaDaoSupport implements Dao {

	public void save(Actor a) {
		getJpaTemplate().persist(a);
		
	}	

}
