package rlabs;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Zoo {

    private String name;
    private String address;

    private ArrayList<Animal> animals = new ArrayList<>();

    public Zoo(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void add(Animal animal)
    {
        this.animals.add(animal);
        saveData();
    }
    public void add(Animal animal, int idx)
    {
        if(idx >-1 && idx<this.animals.size())
        {
            this.animals.add(idx,animal);
        }
        saveData();
    }

    public void makeNoise()
    {
        for(Animal animal : this.animals)
        {
            if(animal !=null)
            {
                animal.makeSound();
            }
        }
    }

    public List<Animal> getAnimals()
    {
        return new ArrayList<>(this.animals);
    }

    public void guardTheZoo()
    {
        /*for(Animal animal : this.animals)
        {
            if(animal !=null)
            {
                if(animal instanceof Dog) {
                    animal.makeSound();
                }
            }
        }*/

        for(Animal animal : this.animals)
        {
            if(animal !=null)
            {
                if(animal instanceof Dog) {//downcasting ** not safe, must check instance before casting
                    Dog dog = (Dog)animal;
                    dog.guard();
                }
            }
        }
    }

    public void printAllAnimals() {
        if(this.animals.isEmpty())
        {
            System.out.println("There are no animals yet");
            return;
        }
        for (Animal animal : this.animals)
        {
            if(animal==null)
            {
                continue;
            }
            System.out.println(">>"+animal.introduce()+"\n");
        }
    }


    public void saveData()
    {
        Main.animalsDAO.save(this.animals);
    }




}
