package org.solarflare.myFirstDBProject;



import jakarta.transaction.Transactional;
import org.solarflare.myFirstDBProject.beans.Classroom;
import org.solarflare.myFirstDBProject.beans.Student;
import org.solarflare.myFirstDBProject.beans.University;
import org.solarflare.myFirstDBProject.dao.ClassroomDAO;
import org.solarflare.myFirstDBProject.dao.StudentDAO;
import org.solarflare.myFirstDBProject.dao.UniversityDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Scanner;


import java.util.List;

@Component
public class SystemManager {

    @Autowired
    private StudentDAO studentDAO;
    @Autowired
    private UniversityDAO universityDAO;
    @Autowired
    private ClassroomDAO classroomDAO;
    @Transactional
    public void run()
    {
        String loop_input1="",loop_input2="";
        List<Student> students= new ArrayList<>();
        List<University> universities= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Adding university to database");
          University university = new University();
//
//        System.out.print("Enter The University Name: ");
//        String university_name = scanner.nextLine();  // Reads a line of text input
          university.setName("Harvard");
//
//        System.out.print("Enter The University City: ");
//        String university_city_name = scanner.nextLine();  // Reads a line of text input
          university.setCity("Boston");
//
//        System.out.print("Enter The University year of creation: ");
//        int university_year_of_creation = scanner.nextInt();  // Reads a line of text input
//        scanner.nextLine(); // Consume newline character
          university.setYearOfFoundation(1850);
//
//        universityDAO.save(university);

//        if (university.getId()!=1)
//        {
//            universityDAO.save(university);
//        }

        universityDAO.save(university);

        while(!loop_input1.equalsIgnoreCase("exit")) {


            System.out.println("Adding student to database");
            Student student = new Student();

            System.out.print("Enter The Student Name: ");
            String student_name = scanner.nextLine();  // Reads a line of text input
            student.setName(student_name);

            System.out.print("Enter The Student e-mail: ");
            String student_email = scanner.nextLine();  // Reads a line of text input
            student.setEmail(student_email);

            System.out.print("Enter The Student Faculty: ");
            String student_faculty = scanner.nextLine();  // Reads a line of text input
            student.setFaculty(student_faculty);

            System.out.print("Enter The Student Average: ");
            float student_average = scanner.nextFloat();
            scanner.nextLine(); // Consume newline character
            student.setAverage(student_average);

            System.out.print("Enter The Student Grade in Java: ");
            float student_java_grade = scanner.nextFloat();
            scanner.nextLine(); // Consume newline character
            student.setJavaGrade(student_java_grade);

            System.out.print("Enter The Student Grade in Python: ");
            float student_Python_Grade = scanner.nextFloat();
            scanner.nextLine(); // Consume newline character
            student.setPythonGrade(student_Python_Grade);

            student.setUniversity(university); //ask rami about this line


            studentDAO.save(student);
            students = studentDAO.findAll();

            universities = universityDAO.findAll();

            System.out.print("if there is no more students to add please enter 'exit' else enter 'continue': ");
            loop_input1= scanner.nextLine();
        }

        System.out.println(students);
        System.out.println(universities);



        while(!loop_input2.equalsIgnoreCase("exit")) {
            System.out.println("Adding class room to database");
            Classroom classroom = new Classroom();

            System.out.print("Enter The Classroom Name: ");
            String classroom_name = scanner.nextLine();
            classroom.setName(classroom_name);

            System.out.print("Enter The Classroom Floor: ");
            int classroom_floor = scanner.nextInt();
            scanner.nextLine();
            classroom.setFloor(classroom_floor);

            classroomDAO.save(classroom);

            System.out.print("if there is no more classrooms to add please enter 'exit' else enter 'continue': ");
            loop_input2= scanner.nextLine();

        }



        System.out.println(studentDAO.getClass());

        System.out.println("The bast students in my university");
        List<Student> bestStudents = studentDAO.findStudentsByAverageGreaterThan(80.0f);

        System.out.println(bestStudents);

        System.out.println(studentDAO.findStudentsByNameLike("Ra%"));

        System.out.println(studentDAO.findByJavaGradeOrPythonGradeGreaterThan(80,70));
        System.out.println(studentDAO.getAllOldStudents(20));



    }
}
