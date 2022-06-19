/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projenesne;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AYDINKAĞANTÜRKOĞLU
 */
public class ExistingCustomerTest {
    Date d1 = new Date();
    SubscriptionPlan plan1 = new SubscriptionPlan("24mbps");
    Subscription sub1 = new Subscription(d1,plan1);
       ExistingCustomer excu2 = new ExistingCustomer("1234",sub1);
       ExistingCustomer excu = new ExistingCustomer("12344",sub1);
       Subscription sub2 = new Subscription(d1,plan1);
    public ExistingCustomerTest() {
    
    }

    /**
     * Test of getSubscription method, of class ExistingCustomer.
     */
    @Test
    public void testGetSubscription() {
       sub1 = excu2.getSubscription();
    }

    /**
     * Test of setSubscription method, of class ExistingCustomer.
     */
    @Test
    public void testSetSubscription() {
        excu2.setSubscription(sub2);
    }
    
}
