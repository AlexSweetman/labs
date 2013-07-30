/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author sweal144
 */
public class Major {
   private String name;

   @Override
   public String toString() {
      return name;
   }

   public Major(String name) {
      this.name = name;
   }
   
}
