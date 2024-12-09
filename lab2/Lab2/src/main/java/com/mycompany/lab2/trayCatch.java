
package com.mycompany.lab2;

import java.util.Scanner;

public class trayCatch {
 public static void main(String[] args) {
        System.out.println("Hello World!");
        int num[]={1,2,3,4,5};
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        try{
            System.out.println(num[num1]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Don't try buffer overflow attacks in gava");
        }
    }  
}
