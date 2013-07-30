/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sweal144
 */
public class Student {

   private String name;
   private int id;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Student(String name, int id) {
      this.name = name;
      this.id = id;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }
   private List papers = new ArrayList();

   @Override
   public String toString() {
      return "Student{" + "name=" + name + ", id=" + id + '}';
   }
}
