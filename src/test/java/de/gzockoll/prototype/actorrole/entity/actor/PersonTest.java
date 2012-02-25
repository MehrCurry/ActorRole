package de.gzockoll.prototype.actorrole.entity.actor;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNull.*;

/**
 *
 * @author guidp
 */
public class PersonTest {
    
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testPerson() {
        Person p=new Person("JUnit", "Test");
        assertThat(p.getId(),is(nullValue()));
    }
}
