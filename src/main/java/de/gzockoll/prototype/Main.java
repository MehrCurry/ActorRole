package de.gzockoll.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.gzockoll.prototype.control.Manager;
import de.gzockoll.prototype.entity.Account;
import de.gzockoll.prototype.entity.actor.Organization;
import de.gzockoll.prototype.entity.actor.Person;
import de.gzockoll.prototype.entity.roles.Dealer;
import de.gzockoll.prototype.entity.roles.Salesman;

@Component
public class Main {

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Autowired
	private Manager manager;

	public void init() {

		Organization org = new Organization("Test GmbH");
		org.addRole(new Dealer(org));

		Person e = new Person("Rigby", "Reardon");
		Salesman s = new Salesman(e);
		manager.persist(e);

		Person p = new Person("Guido", "Zockoll");

		Account a = new Account("gzockoll", "bla");
		Dealer d = (Dealer) org.asRole("Dealer");
		d.setAccount(a);
		manager.persist(org);

		manager.persist(p);
	}

}
