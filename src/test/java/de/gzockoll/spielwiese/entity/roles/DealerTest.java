package de.gzockoll.spielwiese.entity.roles;

import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.gzockoll.spielwiese.entity.Address;
import de.gzockoll.spielwiese.entity.actor.Organization;

public class DealerTest {

	private Organization org;

	@Before
	public void setUp() throws Exception {
		org = new Organization("JUnit GmbH");
		new Dealer(org);
		Address a=new Address("Abcstr", "13", "12345", "Kleinkleckersdorg");
		org.setAddress(a);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetBillingAddress() {
		Organization z=new Organization("Zentrale");
		Dealer d = new Dealer(z);
		Address a=new Address("Xyzstr", "1", "98765", "Groﬂkleckersdorg");
		z.setAddress(a);
		
		Dealer d1=(Dealer) org.asRole("Dealer");
		Assert.assertEquals("Abcstr", d1.getBillingAddress().getStrasse());
		
		d1.setZentrale(d);
		Assert.assertEquals("Xyzstr", d1.getBillingAddress().getStrasse());
			
	}

}
