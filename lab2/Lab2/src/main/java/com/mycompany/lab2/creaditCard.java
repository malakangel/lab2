
package com.mycompany.lab2;

public class creaditCard {
    private int limit;
    private double balance;
    public creaditCard(){
    this.limit=0;
    this.balance=0.0;
    }
    public creaditCard(int limit,double balance){
    this.limit=limit;
    this.balance=balance;
    }
    public boolean charge(double price){
    if(price+balance>limit){
        return false;}
    balance+=price;
    return true;
    }
    
}

