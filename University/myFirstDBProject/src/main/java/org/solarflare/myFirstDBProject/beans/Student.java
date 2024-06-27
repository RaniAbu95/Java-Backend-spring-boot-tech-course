package org.solarflare.myFirstDBProject.beans;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "faculty")
    private String faculty;



    private float average;
    private Float age;

    private float javaGrade;
    private float pythonGrade;

    @ManyToOne(fetch = FetchType.LAZY)
    //@ManyToOne
    @JoinColumn(name = "university_id")
    private University university;


    @ManyToMany
    @JoinTable()
    private List<Classroom> classrooms;

    public Student() {
    }

    public Student( String name, String email, String faculty) {
        this.name = name;
        this.email = email;
        this.faculty = faculty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public Float getAge() {
        return age;
    }

    public void setAge(Float age) {
        this.age = age;
    }

    public float getJavaGrade() {
        return javaGrade;
    }

    public void setJavaGrade(float javaGrade) {
        this.javaGrade = javaGrade;
    }

    public float getPythonGrade() {
        return pythonGrade;
    }

    public void setPythonGrade(float pythonGrade) {
        this.pythonGrade = pythonGrade;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public void setClassrooms(List<Classroom> classrooms) {
        this.classrooms = classrooms;
    }


    public University getUniversity() {
        return university;
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", faculty='" + faculty + '\'' +
                ", average='" + average + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
