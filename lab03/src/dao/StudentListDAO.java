/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Student;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author sweal144
 */
public class StudentListDAO implements StudentDAO {
   
   private static Collection<Student> students = new ArrayList<>();

   @Override
   public void save(Student aStudent) {
      students.add(aStudent);
   }
   
  
   @Override
   public Collection<Student> getStudents() {
      return students;
   }
   
}
