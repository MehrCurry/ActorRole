package de.gzockoll.spielwiese.entity.roles;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import de.gzockoll.spielwiese.entity.Account;
import de.gzockoll.spielwiese.entity.Actor;
import de.gzockoll.spielwiese.entity.ActorRole;
import de.gzockoll.spielwiese.entity.Address;

@Entity
public class Dealer extends ActorRole {

	@ManyToOne
	private SalesLine salesline;

	private Dealer zentrale;
	
	public Dealer getZentrale() {
		return zentrale;
	}

	public void setZentrale(Dealer zentrale) {
		this.zentrale = zentrale;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	private Account account;
	
    @OneToMany(mappedBy="dealer")
	private List<Salesman> salesmen=new ArrayList<Salesman>();

	// @OneToMany(mappedBy="dealer")
	// private List<Salesman> salesmen=new ArrayList<Salesman>();
	
	public Dealer(Actor actor) {
		super(actor);
	}
	
	public SalesLine getSalesline() {
		return salesline;
	}

	public void setSalesline(SalesLine salesline) {
		this.salesline = salesline;
	}

	@Override
	public String getRoleName() {
		return "Dealer";
	}
	
	public void addSalesman(Salesman s) {
		salesmen.add(s);
		s.setDealer(this);
		
	}
	
	public Address getBillingAddress() {
		if (zentrale!=null)
			return zentrale.getBillingAddress();
		else
			return getActor().getAddress();
	}
}
