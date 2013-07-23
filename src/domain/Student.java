/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author sweal144
 */
public class Student {
   private String name;
   private int ID;

   public Student(String name, int ID) {
      this.name = name;
      this.ID = ID;
   }
   
   

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getID() {
      return ID;
   }

   public void setID(int ID) {
      this.ID = ID;
   }

   @Override
   public String toString() {
      return "Student{" + "name=" + name + ", ID=" + ID + '}';
   }
}
