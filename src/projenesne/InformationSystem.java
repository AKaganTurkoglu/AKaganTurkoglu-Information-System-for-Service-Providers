/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projenesne;

import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author AYDINKAĞANTÜRKOĞLU
 */
public class InformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    ExistingCustomer[] existingCustomers = new ExistingCustomer[50]; 
    Possiblecustomer[] possiblecustomers = new Possiblecustomer[50];
    CableProvider[] cableProviders = new CableProvider[50];
    Customer[] customers = new Customer[50];
    GSMProvider[] GSMProviders = new GSMProvider[50];    
    Subscription[] subscriptions = new Subscription[50];
    SubscriptionPlan[] subscriptionPlans = new SubscriptionPlan[50];
    int NumberOF_ExistingCustomer=0,NumberOF_Possiblecustomer=0,NumberOF_CableProvider=0,NumberOF_Customer=0,NumberOF_GSMProvider=0,NumberOF_Subscription=0,NumberOF_SubscriptionPlan=0;
    int cikis=0,islem=0,j,bul,bul2,sayi;
    String isim,isim2;
    // ÖRNEK GİRİŞLERİ
    CableProvider TURKNET = new CableProvider("TURKNET");
    cableProviders[NumberOF_CableProvider]= TURKNET;
    NumberOF_CableProvider++;
    SubscriptionPlan plan1 = new SubscriptionPlan("24mbps");
    subscriptionPlans[NumberOF_SubscriptionPlan]=plan1;
    NumberOF_SubscriptionPlan++;
    SubscriptionPlan plan2 = new SubscriptionPlan("50mbps");
    subscriptionPlans[NumberOF_SubscriptionPlan]=plan2;
    NumberOF_SubscriptionPlan++;
    SubscriptionPlan plan3 = new SubscriptionPlan("100mbps");
    subscriptionPlans[NumberOF_SubscriptionPlan]=plan3;
    NumberOF_SubscriptionPlan++;
    TURKNET.addSubscriptionPlan(plan1);
    TURKNET.addSubscriptionPlan(plan2);
    TURKNET.addSubscriptionPlan(plan3);
    GSMProvider TURKCELL = new GSMProvider("TURKCELL");
    GSMProviders[NumberOF_GSMProvider]=TURKCELL;
    NumberOF_GSMProvider++;
    SubscriptionPlan plan4 = new SubscriptionPlan("4gb");
    subscriptionPlans[NumberOF_SubscriptionPlan]=plan4;
    NumberOF_SubscriptionPlan++;
    SubscriptionPlan plan5 = new SubscriptionPlan("8gb");
    subscriptionPlans[NumberOF_SubscriptionPlan]=plan5;
    NumberOF_SubscriptionPlan++;
    SubscriptionPlan plan6 = new SubscriptionPlan("12gb");
    subscriptionPlans[NumberOF_SubscriptionPlan]=plan6;
    NumberOF_SubscriptionPlan++;
    TURKCELL.addSubscriptionPlan(plan6);
    TURKCELL.addSubscriptionPlan(plan5);
    TURKCELL.addSubscriptionPlan(plan4);
    Possiblecustomer Ahmet = new Possiblecustomer("12345678910");
    Ahmet.setName("Ahmet Demir");
    Ahmet.setMail("ahmet@gmail.com");
    Ahmet.setTel("5320279151");
    customers[NumberOF_Customer]=Ahmet;
    possiblecustomers[NumberOF_Possiblecustomer]=Ahmet;
    NumberOF_Customer++;
    NumberOF_Possiblecustomer++;
    while(cikis==0){
        System.out.println("WELCOME TO THE Service Providers HUB");
        System.out.println("press 1 to add Customer"); 
        System.out.println("press 2 to add Subscription Plan");
        System.out.println("press 3 to add GSM Provider");
        System.out.println("press 4 to add Cable Provider");
        System.out.println("press 5 to add GSM Provider a Subscription Plan");
        System.out.println("press 6 to add Cable Provider a Subscription Plan");
        System.out.println("**** press 7 to Subscribe Customer to a Subscription Plan ****");
        islem = scanner.nextInt();
        isim = scanner.nextLine();
switch (islem) {
  case 1:
        System.out.println("Enter Citizenship number");
        isim = scanner.nextLine();
        j=0;
        while (j<NumberOF_Possiblecustomer) {
    if (isim.equals(customers[j].getName()) ) {
        System.out.println("This Citizenship number is taken please enter new Citizenship number");
        isim = scanner.nextLine();   
        j=0;
    }
    j++;
}
        Possiblecustomer possiblecustomer = new Possiblecustomer(isim);
        System.out.println("Enter your name");
        isim = scanner.nextLine();  
        possiblecustomer.setName(isim);
        System.out.println("Enter your Phone number");
        isim = scanner.nextLine();
        possiblecustomer.setTel(isim);    
        System.out.println("Enter your Email");
        isim = scanner.nextLine();
        possiblecustomer.setMail(isim);
      customers[NumberOF_Possiblecustomer]=possiblecustomer;
      possiblecustomers[NumberOF_Possiblecustomer]=possiblecustomer;
      NumberOF_Possiblecustomer++;
      NumberOF_Customer++;
      System.out.println("---------------------------------------------");
       System.out.println("---------------------------------------------");
      System.out.println("CUSTOMER CITIZENSHIP NUMBER= "+possiblecustomer.getCitizenshipNr());
      System.out.println("CUSTOMER TEL NUMMBER= "+possiblecustomer.getTel());
      System.out.println("CUSTOMER MAİL= "+possiblecustomer.getMail());
      System.out.println("CUSTOMER NAME="+possiblecustomer.getName()); 
      System.out.println("---------------------------------------------"); 
      System.out.println("---------------------------------------------");
      System.out.println("işlem tamamlandı devam edebilirsiniz");
      System.out.println("---------------------------------------------");
    break;
  case 2:
        System.out.println("enter the Subscription Plan's NAME");
        isim = scanner.nextLine();   
        j=0;
        while (j<NumberOF_SubscriptionPlan) {
    if (isim.equals(subscriptionPlans[j].getName()) ) {
        System.out.println("This Subscription Plan is taken please enter new Citizenship number");
        isim = scanner.nextLine();   
        j=0;
    }
    j++;
}
        SubscriptionPlan subscriptionPlan = new SubscriptionPlan(isim);
        subscriptionPlans[NumberOF_SubscriptionPlan] = subscriptionPlan;
        NumberOF_SubscriptionPlan++;
    break;
  case 3:
        System.out.println("enter the GSM Provider's NAME");
        isim = scanner.nextLine();
        j=0;
        while (j<NumberOF_GSMProvider) {
    if (isim.equals(GSMProviders[j].getName()) ) {
        System.out.println("This GSM Provider is taken please enter new Citizenship number");
        isim = scanner.nextLine(); 
        j=0;
    }
    j++;
}
        GSMProvider gSMProvider = new  GSMProvider(isim);
        GSMProviders[NumberOF_GSMProvider] = gSMProvider;
        NumberOF_GSMProvider++;
    break;
  case 4:
    System.out.println("enter the Cable Provider's NAME");
    isim = scanner.nextLine();
        j=0;
        while (j<NumberOF_CableProvider) {
    if (isim.equals(cableProviders[j].getName()) ) {
        System.out.println("This Cable Provider is taken please enter new Citizenship number");
        isim = scanner.nextLine();  
        j=0;
    }
    j++;
}
        CableProvider cableProvider = new CableProvider(isim);
        cableProviders[NumberOF_CableProvider] = cableProvider;
        NumberOF_CableProvider++;
    break;
  case 5:
    System.out.println("enter the GSM Provider's NAME");
        isim = scanner.nextLine();
        System.out.println("enter the Subscription Plan's NAME");
        isim2 = scanner.nextLine();
         bul=-1;
         bul2=-1;
        while(bul==-1&&bul2==-1){
            j=0;
        while (j<NumberOF_GSMProvider) {
    if (isim.equals(GSMProviders[j].getName()) ) {
        System.out.println("GSM Provider is found");  
        bul=j;
    }
    j++;
        }
        j=0;
        while (j<NumberOF_SubscriptionPlan) {
    if (isim2.equals(subscriptionPlans[j].getName()) ) {
        System.out.println("Subscription Plan is found");  
        bul2=j;
    }
    j++;
        }
        if(bul==-1){
        System.out.println("We cant find GSM Provider's NAME please enter another one");
        isim = scanner.nextLine();    
        }
        if(bul2==-1){
        System.out.println("We cant find Subscription Plan please enter another one");
        isim2 = scanner.nextLine();    
        }
        }
        GSMProviders[bul].addSubscriptionPlan(subscriptionPlans[bul2]);
     System.out.println("---------------------------------------------");
      System.out.println("işlem tamamlandı devam edebilirsiniz");
      System.out.println("---------------------------------------------");
    break;
  case 6:
    System.out.println("enter the Cable Provider's NAME");
        isim = scanner.nextLine();
        System.out.println("enter the Subscription Plan's NAME");
        isim2 = scanner.nextLine();
         bul=-1;
         bul2=-1;
        while(bul==-1&&bul2==-1){
            j=0;
        while (j<NumberOF_CableProvider) {
    if (isim.equals(cableProviders[j].getName()) ) {
        System.out.println("Cable Provider is found");  
        bul=j;
    }
    j++;
        }
        j=0;
        while (j<NumberOF_SubscriptionPlan) {
    if (isim2.equals(subscriptionPlans[j].getName()) ) {
        System.out.println("Subscription Plan is found");  
        bul2=j;
    }
    j++;
        }
        if(bul==-1){
        System.out.println("We cant find Cable Provider's NAME please enter another one");
        isim = scanner.nextLine();    
        }
        if(bul2==-1){
        System.out.println("We cant find Subscription Plan please enter another one");
        isim2 = scanner.nextLine();    
        }
        }
        cableProviders[bul].addSubscriptionPlan(subscriptionPlans[bul2]);
     System.out.println("---------------------------------------------");
      System.out.println("işlem tamamlandı devam edebilirsiniz");
      System.out.println("---------------------------------------------");
    break;
    
  case 7:
    System.out.println(" for GSM press 1 ----- for CABLE press 2");
    islem = scanner.nextInt();
    isim = scanner.nextLine();
    if(islem==1){
     System.out.println("enter the GSM Provider's NAME");
        isim = scanner.nextLine();
         bul=-1;
        while(bul==-1){
            j=0;
        while (j<NumberOF_GSMProvider) {
    if (isim.equals(GSMProviders[j].getName()) ) {
        System.out.println("GSM Provider is found");  
        bul=j;
    }
    j++;
        }      
        if(bul==-1){
        System.out.println("We cant find GSM Provider's NAME please enter another one");
        isim = scanner.nextLine();    
        }
    }
    bul2=-1;
    System.out.println("enter the Subscription Plan's NAME");
        isim2 = scanner.nextLine();
    while(bul2==-1){
       
        if(null==GSMProviders[bul].findSubscriptionPlan(isim2)){
    System.out.println("We cant find This Subscription Plan in this Service Provider Enter Another name");
     isim2 = scanner.nextLine();   }
        else{
            System.out.println("Subscription Plan Found");
            bul2=2;
        }
    }
       Date d1 = new Date(); 
       Subscription subscription = new Subscription(d1,GSMProviders[bul].findSubscriptionPlan(isim2));
       subscriptions[NumberOF_Subscription] = subscription;
       NumberOF_Subscription++;
       System.out.println("Enter Citizenship number");
        isim = scanner.nextLine();
        bul2=bul;
        bul=-1;
        while(bul==-1){
            j=0;
        while (j<NumberOF_Customer) {
    if (isim.equals(customers[j].getCitizenshipNr()) ) {
        System.out.println("Customer is found");  
        bul=j;
    }
    j++;
        } 
        if(bul==-1){
        System.out.println("We cant find Customer please enter another Citizenship number");
        isim = scanner.nextLine();    
        }
        }
        ExistingCustomer existingCustomer = new ExistingCustomer(isim,subscription);
        existingCustomer.setMail(customers[bul].getMail());
        existingCustomer.setTel(customers[bul].getTel());
        existingCustomer.setName(customers[bul].getName());
        existingCustomers[NumberOF_ExistingCustomer]=existingCustomer;
        NumberOF_ExistingCustomer++;
       System.out.println("---------------------------------------------");
       System.out.println("---------------------------------------------");
      System.out.println("CUSTOMER CITIZENSHIP NUMBER= "+existingCustomer.getCitizenshipNr());
      System.out.println("CUSTOMER TEL NUMMBER= "+existingCustomer.getTel());
      System.out.println("CUSTOMER MAİL= "+existingCustomer.getMail());
      System.out.println("CUSTOMER NAME="+existingCustomer.getName());
      System.out.println("SERVICE PROVIDER="+GSMProviders[bul2].getName());
      System.out.println("SUBSCRIPTION START DATE ="+subscription.getSubscriptionStartDate());
      System.out.println("SUBSCRIPTION PLAN NAME ="+isim2); 
      System.out.println("---------------------------------------------");
      System.out.println("---------------------------------------------");   
    }
    if (islem==2){ 
     System.out.println("enter the Cable Provider's NAME");
        isim = scanner.nextLine();
         bul=-1;
        while(bul==-1){
            j=0;
        while (j<NumberOF_CableProvider) {
    if (isim.equals(cableProviders[j].getName()) ) {
        System.out.println("Cable Provider is found");  
        bul=j;
    }
    j++;
        }      
        if(bul==-1){
        System.out.println("We cant find Cable Provider's NAME please enter another one");
        isim = scanner.nextLine();    
        }
    }
    bul2=-1;
    System.out.println("enter the Subscription Plan's NAME");
        isim2 = scanner.nextLine();
    while(bul2==-1){
       
        if(null==cableProviders[bul].findSubscriptionPlan(isim2)){
    System.out.println("We cant find This Subscription Plan in this Service Provider Enter Another name");
     isim2 = scanner.nextLine();   }
        else{
            System.out.println("Subscription Plan Found");
            bul2=2;
        }
    }
       Date d1 = new Date(); 
       Subscription subscription = new Subscription(d1,cableProviders[bul].findSubscriptionPlan(isim2));
       subscriptions[NumberOF_Subscription] = subscription;
       NumberOF_Subscription++;
       System.out.println("Enter Citizenship number");
        isim = scanner.nextLine();
        bul2=bul;
        bul=-1;
        while(bul==-1){
            j=0;
        while (j<NumberOF_Customer) {
    if (isim.equals(customers[j].getCitizenshipNr()) ) {
        System.out.println("Customer is found");  
        bul=j;
    }
    j++;
        } 
        if(bul==-1){
        System.out.println("We cant find Customer please enter another Citizenship number");
        isim = scanner.nextLine();    
        }
        }
        ExistingCustomer existingCustomer = new ExistingCustomer(isim,subscription);
        existingCustomer.setMail(customers[bul].getMail());
        existingCustomer.setTel(customers[bul].getTel());
        existingCustomer.setName(customers[bul].getName());
        existingCustomers[NumberOF_ExistingCustomer]=existingCustomer;
        NumberOF_ExistingCustomer++;
        System.out.println("** SUBSCRİPTİON SUCCESSFUL** ");
       System.out.println("---------------------------------------------");
       System.out.println("---------------------------------------------");
      System.out.println("CUSTOMER CITIZENSHIP NUMBER= "+existingCustomer.getCitizenshipNr());
      System.out.println("CUSTOMER TEL NUMMBER= "+existingCustomer.getTel());
      System.out.println("CUSTOMER MAİL= "+existingCustomer.getMail());
      System.out.println("CUSTOMER NAME="+existingCustomer.getName());
      System.out.println("SERVICE PROVIDER="+cableProviders[bul2].getName());
      System.out.println("SUBSCRIPTION START DATE ="+subscription.getSubscriptionStartDate());
      System.out.println("SUBSCRIPTION PLAN NAME ="+isim2); 
      System.out.println("---------------------------------------------");
      System.out.println("---------------------------------------------");     
    }
    break;
}
        System.out.println("PRESS 0 TO CONTİNUE ---- PRESS 1 TO END PROGRAM SAFELY");
        cikis = scanner.nextInt();
        isim = scanner.nextLine();
    }
    
    
    
    
    
    
    
    }
    
}
