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
public class SubscriptionTest {
    Date d1 = new Date();
    Date d2 = new Date();
    SubscriptionPlan plan1 = new SubscriptionPlan("24mbps");
    SubscriptionPlan plan2 = new SubscriptionPlan("50mbps");
    Subscription sub1 = new Subscription(d1,plan1);
    public SubscriptionTest() {
    }

    /**
     * Test of getSubscriptionStartDate method, of class Subscription.
     */
    @Test
    public void testGetSubscriptionStartDate() {
      d2 =  sub1.getSubscriptionStartDate();
    }

    /**
     * Test of setSubscriptionStartDate method, of class Subscription.
     */
    @Test
    public void testSetSubscriptionStartDate() {
        sub1.setSubscriptionStartDate(d2);
    }

    /**
     * Test of setSubscriptionPlan method, of class Subscription.
     */
    @Test
    public void testSetSubscriptionPlan() {
        sub1.setSubscriptionPlan(plan2);
    }
    
}
