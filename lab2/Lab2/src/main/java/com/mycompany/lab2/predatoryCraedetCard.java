
package com.mycompany.lab2;

public class predatoryCraedetCard extends creaditCard{
    public boolean charge(double price){
    boolean isSuccess=super.charge(price);
    //2 if(!isSuccess) super.charge(5);
    if(!isSuccess) charge(5);
    return isSuccess;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        predatoryCraedetCard opj=new predatoryCraedetCard();
        System.out.println(opj.charge(3));
    }
}

