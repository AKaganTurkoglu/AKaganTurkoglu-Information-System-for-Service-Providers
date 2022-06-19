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
public class CableProviderTest {
    
            CableProvider TestCableProvider = new CableProvider("TURKNET");
    
    public CableProviderTest() {

    }

    /**
     * Test of addSubscriptionPlan method, of class CableProvider.
     */
    @Test
    public void testAddSubscriptionPlan() {
    SubscriptionPlan plan1 = new SubscriptionPlan("4gb");
    TestCableProvider.addSubscriptionPlan(plan1);
    SubscriptionPlan plan2 = new SubscriptionPlan("6gb");
    TestCableProvider.addSubscriptionPlan(plan2);
    SubscriptionPlan plan3 = new SubscriptionPlan("6gb");
    TestCableProvider.addSubscriptionPlan(plan3);   
    }

    /**
     * Test of findSubscriptionPlan method, of class CableProvider.
     */
    @Test
    public void testFindSubscriptionPlan() {
    SubscriptionPlan plan1 = new SubscriptionPlan("4gb");
    TestCableProvider.addSubscriptionPlan(plan1);
    SubscriptionPlan plan2 = new SubscriptionPlan("6gb");
    TestCableProvider.addSubscriptionPlan(plan2);
    SubscriptionPlan plan3 =TestCableProvider.findSubscriptionPlan("6gb");       
    }

    /**
     * Test of getName method, of class CableProvider.
     */
    @Test
    public void testGetName() {
    String A = "TURKNET";
    String B = TestCableProvider.getName();
    assertEquals(A,B); 
    }
    
}
