/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

/**
 *
 * @author sweal144
 */
public class Lab01 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      System.out.println("Hello World");
      Student s = new Student("Alex", 1234);
      System.out.println(s);
      
     for(int i=0; i<10; i++) {
        int x = i * 2;
        System.out.println(x);
     }
   }
}
