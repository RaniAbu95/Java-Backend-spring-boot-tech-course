package rlabs.dao;

import rlabs.Animal;
import rlabs.AnimalsFactory;
import rlabs.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AnimaFileDAO implements AnimalDAO{
    public final static String filePath = "c:\\temp\\animals-data\\animals.txt";

    @Override
    public void save(List<Animal> animals) {
        String data = "";
        for (Animal animal : animals)
        {
            String line = animal.getType()+", "+animal.getName()+", "+animal.getAge()+", "+animal.getColor();
            data += line+System.lineSeparator();
        }
        writeDataToFile(data);
    }

    private Animal setupAnimalInfo(String type, String name, String color, int age)
    {
        Animal animal = AnimalsFactory.createAnimal(type,name);
        animal.setColor(color);
        animal.setAge(age);
        return animal;
    }

    @Override
    public List<Animal> read() {
        List<Animal> animals = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if("".equals(line.trim()) || !line.contains(","))
                {
                    continue;
                }
                String[] values = line.split(",");
                String animalType = values[0].trim();
                String name = values[1].trim();
                int age = Integer.parseInt(values[2].trim());
                String color = values[3];
                animals.add(setupAnimalInfo(animalType, name,color,age));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return animals;

    }


    private void writeDataToFile(String data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(data);
            bw.newLine(); // To add a new line if needed
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
