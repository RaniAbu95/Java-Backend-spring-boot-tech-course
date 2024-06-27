package org.solarflare.myFirstDBProject.dao;

import org.solarflare.myFirstDBProject.beans.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //Not mandatory
public interface StudentDAO extends JpaRepository<Student, Integer> {

    List<Student> findStudentsByAverageGreaterThan (float avg);
    List<Student> findStudentsByNameLike(String name);
    List<Student> findByAgeLessThan(float age);
    List<Student> findByJavaGradeOrPythonGradeGreaterThan(float javaGrade, float pythonGrade);


    @Query(value = "select * from students where age>:age", nativeQuery = true)
    //@Query(value = "select * from students where age>?1", nativeQuery = true)
    List<Student> getAllOldStudents(float age);
}
