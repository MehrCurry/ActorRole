package de.gzockoll.spielwiese;

import de.gzockoll.spielwiese.control.Manager;
import de.gzockoll.spielwiese.entity.Account;
import de.gzockoll.spielwiese.entity.actor.Organization;
import de.gzockoll.spielwiese.entity.actor.Person;
import de.gzockoll.spielwiese.entity.roles.Dealer;
import de.gzockoll.spielwiese.entity.roles.Salesman;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	private Manager manager;
	
	public void init() {
		
		Organization org=new Organization("Test GmbH");
		org.addRole(new Dealer(org));
		
		Person e = new Person("Rigby", "Reardon");
		Salesman s=new Salesman(e);
		manager.persist(e);
		
		Person p = new Person("Guido","Zockoll");
		
		Account a = new Account("gzockoll","bla");
		Dealer d=(Dealer) org.asRole("Dealer");
		d.setAccount(a);
		manager.persist(org);
		
		manager.persist(p);
	}

}
