/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sweal144
 */
public class StudentListDAO implements StudentDAO {
   private static ArrayList;

   @Override
   public void save(Student aStudent) {
      Student.add(aStudent);
   }

   @Override
   public List<Student> getStudents() {
      return Student;
   }
   
}
