/*
 * Person.java
 * 
 * Created on Sep 23, 2007, 4:36:39 PM
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package de.gzockoll.prototype.actorrole.entity.actor;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import de.gzockoll.prototype.actorrole.entity.Actor;

/**
 *
 * @author Frank D. Martinez. fmartinez@asimovt.com
 */
@Entity()
public class Person extends Actor implements Serializable {

    public Person() {
    }

    public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Column()
    private String firstName;
    
    @Column()
    private String middleName;
    
    @Column()
    private String lastName;
    
    @Column()
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    
    @PrePersist() 
    @PreUpdate()
    protected void onPersistOrUpdate() {
        StringBuilder sb = new StringBuilder();
        sb.append(lastName).append(", ");
        sb.append(firstName);
        if (middleName != null) sb.append(" ").append(middleName);
        setCommercialName(sb.toString());
    }
    
}
