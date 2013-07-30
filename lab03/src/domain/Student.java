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

   public static void add(Student aStudent) {
      throw new UnsupportedOperationException("Not yet implemented");
   }
   private String name;
   private int ID;
   private Major major;

   public Major getMajor() {
      return major;
   }

   public void setMajor(Major major) {
      this.major = major;
   }

   public Student(String name, int ID, Major major) {
      this.name = name;
      this.ID = ID;
      this.major = major;
      
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
      return "Student{" + "name=" + name + ", ID=" + ID + ", Major=" + major + '}';
   
   }
}
