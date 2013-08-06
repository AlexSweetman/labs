package dao;

import domain.Student;
import java.util.Collection;
import javax.swing.JList;

public interface StudentDAO {

   /**
    * Adds a student to the DAO.
    *
    * @param student - the student to add.
    */
   void save(Student student);
   
   void delete(Student student);
  

   /**
    * Returns all students that have been added to the DAO.
    *
    * @return The collection of students.
    */
   Collection<Student> getAll();

    public void delete(JList lstStudents);
      
   
   
}
