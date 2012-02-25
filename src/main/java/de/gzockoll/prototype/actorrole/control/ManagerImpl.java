package de.gzockoll.prototype.actorrole.control;

import de.gzockoll.prototype.actorrole.entity.Actor;
import de.gzockoll.prototype.actorrole.entity.actor.Person;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class ManagerImpl extends AbstractManager implements Manger {

	/* (non-Javadoc)
	 * @see de.gzockoll.prototype.control.Manger#persist(de.gzockoll.prototype.entity.Actor)
	 */
	@Override
	public void persist(Actor a) {
		em.persist(a);
	}
        
        @PostConstruct
        public void populateDatabase() {
            Person p = new Person("Rudi","Müller");
            persist(p);
        }
}
