package dao;

import domain.Student;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import javax.swing.JList;

/**
 * A DAO class for managing the storage of Students
 */
public class StudentCollectionsDAO implements StudentDAO {

   private static Collection<Student> students = new HashSet<>();
   private static Collection<Student> major = new ArrayList<>();

   /**
    * Adds a student to the DAO.
    *
    * @param student - the student to add.
    */
   @Override
   public void save(Student student) {
      students.add(student);
      major.add(student);
      
   }

    @Override
    public void delete(Student student) {
        
    }

   /**
    * Returns all students that have been added to the DAO.
    *
    * @return The collection of students.
    */
   @Override
   public Collection<Student> getAll() {
      return students;         
       
   }

    @Override
    public void delete(JList lstStudents) {
    }
}
