package org.solarflare.myFirstDBProject.beans;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "universities")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;
    @Column(name="yearOfFoundation")
    private int yearOfFoundation;

    @OneToMany(mappedBy = "university", cascade = CascadeType.ALL) //same variable name at Student class
    private List<Student> student;

    public University( String univercity_name, String city, int yearOfFoundation) {
        this.name = univercity_name;
        this.city = city;
        this.yearOfFoundation = yearOfFoundation;
    }

    public University() {

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                '}';
    }
}
