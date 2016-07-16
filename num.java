
package helloworld;

import java.util.Scanner;
public class numbers {
     public static void main(String[] args) {
         int n;
         System.out.println("enter the number to check");
         Scanner a=new Scanner(System.in);
         n=a.nextInt();
         if(n>0){
             System.out.println("the no is positive");
         }
         else if(n==0){
             System.out.println("the no is zero");
         }
         else  
             System.out.println("the no is negative ");
         
     }
    
}
