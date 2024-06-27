package org.solarflare.myFirstDBProject.dao;


import org.solarflare.myFirstDBProject.beans.Classroom;
import org.solarflare.myFirstDBProject.beans.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




import org.solarflare.myFirstDBProject.beans.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ClassroomDAO extends JpaRepository<Classroom, Integer> {
    List<Classroom> findUniversityByNameLike(String name);
}
