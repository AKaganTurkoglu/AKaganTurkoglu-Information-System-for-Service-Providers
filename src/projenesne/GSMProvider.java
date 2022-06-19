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
public class GSMProvider implements ServiceProvider {
    private String name;
    private SubscriptionPlan[ ] subscriptionPlans;
    private final static int maxSubscriptionPlan = 50;
    private int SubscriptionPlanCount = 0;
    
    public GSMProvider(String name){
     this.name = name;
     subscriptionPlans = new SubscriptionPlan[maxSubscriptionPlan];
     }
     
    @Override
    public void addSubscriptionPlan(SubscriptionPlan a) {
    for(int i=0; i< SubscriptionPlanCount;i++){
     if(a == subscriptionPlans[i])
         return;
    }
         if(SubscriptionPlanCount < maxSubscriptionPlan){
        subscriptionPlans[SubscriptionPlanCount] = a;
        SubscriptionPlanCount++;
     }
    }

    @Override
    public SubscriptionPlan findSubscriptionPlan(String a) {
    for(int i=0; i < subscriptionPlans.length; i++){
        if(a.equals(subscriptionPlans[i].getName())){
            return subscriptionPlans[i];
        }
    }
    return null;
    }

    @Override
    public String getName() {
         return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
