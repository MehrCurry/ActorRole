package de.gzockoll.prototype.actorrole;

import org.apache.commons.lang.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import de.gzockoll.prototype.actorrole.api.ActorService;
import de.gzockoll.prototype.actorrole.api.Manager;
import de.gzockoll.prototype.actorrole.entity.Account;
import de.gzockoll.prototype.actorrole.entity.actor.Organization;
import de.gzockoll.prototype.actorrole.entity.actor.Person;
import de.gzockoll.prototype.actorrole.entity.roles.Dealer;
import de.gzockoll.prototype.actorrole.entity.roles.Salesman;

@Component
public class Main implements ActorService {
	Logger logger = LoggerFactory.getLogger(Main.class);

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	private Manager manager;

	public void run() {
		logger.debug("Bundle activated!");
		Validate.notNull(manager);
		try {
			Organization org = new Organization("Test GmbH");
			manager.persist(org);
		} catch (Exception e) {
			logger.warn("Excaption", e);
		}
	}

	@Override
	public void init() {

		System.out.println("Bundle activated!");
		logger.debug("Bundle activated!");
		Organization org = new Organization("Test GmbH");
		org.addRole(new Dealer(org));

		Person e = new Person("Rigby", "Reardon");
		Salesman s = new Salesman(e);
		manager.persist(e);

		Person p = new Person("Guido", "Zockoll");

		Account a = new Account("gzockoll", "bla");
		Dealer d = (Dealer) org.asRole(Dealer.class);
		d.setAccount(a);
		manager.persist(org);

		manager.persist(p);
		logger.debug(p.toString());
	}
}
