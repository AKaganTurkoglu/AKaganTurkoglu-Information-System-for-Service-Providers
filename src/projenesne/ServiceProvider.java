/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projenesne;

/**
 *
 * @author AYDINKAĞANTÜRKOĞLU
 */
public interface ServiceProvider {
    public void addSubscriptionPlan(SubscriptionPlan a);
    public SubscriptionPlan findSubscriptionPlan(String a);
    public String getName();
    public void setName(String name);
}
