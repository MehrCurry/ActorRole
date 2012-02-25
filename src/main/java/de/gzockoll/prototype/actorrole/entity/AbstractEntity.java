/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gzockoll.prototype.actorrole.entity;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author guidp
 */
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue
    protected Integer id;

    public AbstractEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
