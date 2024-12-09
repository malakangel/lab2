
package com.mycompany.slide3_progression;


public class Arithmetic extends Slide3_progression{
    protected long increment;
    public Arithmetic(){
    this(1,0);
    }
    public Arithmetic(long increment,long start){
    super(start);
    this.increment=increment;
    }  
    public void advance(){
    current+=increment;
    } 
    
    
    public static void main(String[] args) {
        System.out.println("Hello mimchan"); 
        Arithmetic opj=new Arithmetic(2,0);
        opj.printProgression(10);
    }
}
