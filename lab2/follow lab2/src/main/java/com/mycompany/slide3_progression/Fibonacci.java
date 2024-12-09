
package com.mycompany.slide3_progression;

public class Fibonacci extends Slide3_progression{
    protected long prev;
    public Fibonacci(){this(0,1);}
    public Fibonacci(long start,long second){
    super(start);
    this.prev=second-start;
    }
    public void advance(){
    long temp=prev;
    prev=current;
    current+=temp;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello mimchan"); 
        Fibonacci opj=new Fibonacci(3,5);
        opj.printProgression(3);
        
    }
}
