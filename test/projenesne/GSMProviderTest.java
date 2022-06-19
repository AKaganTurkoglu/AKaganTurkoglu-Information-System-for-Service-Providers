/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projenesne;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AYDINKAĞANTÜRKOĞLU
 */
public class GSMProviderTest {
                CableProvider TestGSMProvider = new CableProvider("TURKCELL");
    public GSMProviderTest() {
    }

    /**
     * Test of addSubscriptionPlan method, of class GSMProvider.
     */
    @Test
    public void testAddSubscriptionPlan() {
        SubscriptionPlan plan1 = new SubscriptionPlan("4gb");
    TestGSMProvider.addSubscriptionPlan(plan1);
    SubscriptionPlan plan2 = new SubscriptionPlan("6gb");
    TestGSMProvider.addSubscriptionPlan(plan2);
    SubscriptionPlan plan3 = new SubscriptionPlan("6gb");
    TestGSMProvider.addSubscriptionPlan(plan3);
    }

    /**
     * Test of findSubscriptionPlan method, of class GSMProvider.
     */
    @Test
    public void testFindSubscriptionPlan() {
        SubscriptionPlan plan1 = new SubscriptionPlan("4gb");
    TestGSMProvider.addSubscriptionPlan(plan1);
    SubscriptionPlan plan2 = new SubscriptionPlan("6gb");
    TestGSMProvider.addSubscriptionPlan(plan2);
    SubscriptionPlan plan3 =TestGSMProvider.findSubscriptionPlan("6gb");
    }

    /**
     * Test of getName method, of class GSMProvider.
     */
    @Test
    public void testGetName() {
        String A = "TURCELL";
    String B = TestGSMProvider.getName();
    assertEquals(A,B); 
    }

    
}
