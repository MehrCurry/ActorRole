package de.gzockoll.prototype.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Account {
	
	public Account() {
		super();
	}
	
	public String getLogin() {
		return login;
	}

	private String login;
	private int passwordEncrypted;
	public Account(String login, String password) {
		this.login = login;
		this.passwordEncrypted = password.hashCode();
	}
	
	public boolean checkPassword(String password) {
		return password.hashCode() == passwordEncrypted;
	}
}
