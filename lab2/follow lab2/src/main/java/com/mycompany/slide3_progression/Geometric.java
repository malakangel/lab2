
package com.mycompany.slide3_progression;

public class Geometric extends Slide3_progression{
    protected long increment;
    public Geometric(){
    this(2,1);
    }
    public Geometric(long increment,long start){
    super(start);
    this.increment=increment;
    }  
    public void advance(){
    current*=increment;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello mimchan"); 
        Geometric opj=new Geometric(3,1);
        opj.printProgression(5);
    }
}
