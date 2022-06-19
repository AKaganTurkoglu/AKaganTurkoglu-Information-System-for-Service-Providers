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
public class CustomerTest {
    Date d1 = new Date();
    SubscriptionPlan plan1 = new SubscriptionPlan("24mbps");
    Subscription sub1 = new Subscription(d1,plan1);
       ExistingCustomer excu2 = new ExistingCustomer("1234",sub1);
       ExistingCustomer excu = new ExistingCustomer("12344",sub1);
       Subscription sub2 = new Subscription(d1,plan1);
    public CustomerTest() {
    }

    /**
     * Test of getCitizenshipNr method, of class Customer.
     */
    @Test
    public void testGetCitizenshipNr() {
        String k = excu.getCitizenshipNr();
        String q = "12344";
        assertEquals(k,q);
    }


    /**
     * Test of setName method, of class Customer.
     */
    @Test
    public void testSetName() {
        excu.setName("ahmet");
    }

    /**
     * Test of getMail method, of class Customer.
     */
    @Test
    public void testGetMail() {
        excu.setMail("kaan@gmail.com");
      String k = excu.getMail();
        String q = "kaan@gmail.com";
        assertEquals(k,q);  
    }


    
    
}
