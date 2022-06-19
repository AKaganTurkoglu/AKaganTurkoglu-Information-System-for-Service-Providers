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
public class SubscriptionPlanTest {
    SubscriptionPlan plan1 = new SubscriptionPlan("24mbps");
    CableProvider TestGSMProvider = new CableProvider("TURKCELL");
     SubscriptionPlan plan2 = new SubscriptionPlan("50mbps",TestGSMProvider);
     ServiceProvider TestGSMProvider2 = new CableProvider("turknet");
    public SubscriptionPlanTest() {
    }

    /**
     * Test of getName method, of class SubscriptionPlan.
     */
    @Test
    public void testGetName() {
        String A = plan1.getName();
        String B = "24mbps";
        assertEquals(A,B); 
    }

    /**
     * Test of getServiceProvider method, of class SubscriptionPlan.
     */
    @Test
    public void testGetServiceProvider() {
        TestGSMProvider2 = plan1.getServiceProvider();
        
    }

    
}
