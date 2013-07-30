/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Student;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author sweal144
 */
public interface StudentDAO {
   void save (Student aStudent);
   Collection<Student> getStudents();
   
   
}
