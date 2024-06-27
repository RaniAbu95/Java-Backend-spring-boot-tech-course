package org.solarflare.myFirstDBProject.dao;

import org.solarflare.myFirstDBProject.beans.Student;
import org.solarflare.myFirstDBProject.beans.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UniversityDAO  extends JpaRepository<University, Integer> {
//    List<University> findStudentsByAverageGreaterThan (float avg);
      List<University> findUniversityByNameLike(String name);
//    List<University> findByAgeLessThan(int yearOfFoundation);
//    List<University> findByJavaGradeOrPythonGradeGreaterThan(float javaGrade, float pythonGrade);


 //   @Query(value = "select * from students where age>:age", nativeQuery = true)
        //@Query(value = "select * from students where age>?1", nativeQuery = true)
//    List<Student> getAllOldStudents(float age);

}
