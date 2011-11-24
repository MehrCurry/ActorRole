package de.gzockoll.spielwiese.entity.roles;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SalesLine {
    @Id()
    @GeneratedValue()
    protected Integer id;

    @OneToMany(mappedBy="salesline")
	private List<Dealer> dealers=new ArrayList<Dealer>();
	
	
	public void addDealer(Dealer d) {
		dealers.add(d);
	}
}
