
package com.mycompany.slide3_progression;

public class Slide3_progression {
    protected long current;
    public Slide3_progression(){this(0);}
    public Slide3_progression(long start){current=start;}
    public long nextValue(){
    long answer=current;
    advance();
    return answer;
    }
    protected void advance(){current++;}
    public void printProgression(int n){
        System.out.print(nextValue());
        for(int j=1;j<n;j++){
        System.out.print(" "+nextValue());
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Slide3_progression opj=new Slide3_progression(1);
        opj.printProgression(6);
    }
}
