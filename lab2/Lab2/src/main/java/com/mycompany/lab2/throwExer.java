
package com.mycompany.lab2;

public class throwExer {
    private int balance; 
    public void makePayment(double amount) { 
            if(amount<0)
                throw new IllegalArgumentException("Negative Amount is not Allowed");
        balance-= amount;
        }

}
