package rlabs.dao;

import rlabs.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalsMongoDBDAO implements AnimalDAO{
    List<Animal> animals = new ArrayList<>();
    @Override
    public void save(List<Animal> animals) {
        String sql = "add documents animals "+animals;
        System.out.println(sql);
        animals.clear();
        animals.addAll(animals);
    }

    @Override
    public List<Animal> read() {
        String sql = "load animals documents";
        System.out.println(sql);
        return new ArrayList<>(animals);
    }
}
