
package com.mycompany.slide3_progression;

public class generic<A,B> {
    A name;
    B age;
    public generic(A a,B b){
    name=a;
    age=b;
    }
    public A getname(){return name;}
    public B getage(){return age;}
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
       /* generic<String,Integer> opj=new generic("malak",21);
        System.out.println(opj.getname());
        System.out.println(opj.getage());*/
        
        generic<Integer,Double> opj1=new generic("malak",21);
        System.out.println(opj1.getname());
        System.out.println(opj1.getage());
    }
}
