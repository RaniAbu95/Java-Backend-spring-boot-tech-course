package rlabs;

import java.util.HashMap;

public abstract class Animal {

    private String name;
    private String color;
    private int legs;
    private int age;
    private static final String SNAKE = "3";

    HashMap<String, String> my_animals_type = new HashMap();

    public Animal(String name, int legs) {
        this.name = name;
        this.setLegs(legs);

        this.my_animals_type.put("1","Lion");
        this.my_animals_type.put("2","Dog");
        this.my_animals_type.put("3","Snake");
        this.my_animals_type.put("4","Cat");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    private void setLegs(int legs) {
        if(legs>0) {
            this.legs = legs;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String introduce();

    public abstract void makeSound();
    public abstract String getType();

}
