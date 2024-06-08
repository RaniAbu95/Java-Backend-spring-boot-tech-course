package rlabs.dao;

import rlabs.Animal;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;

import static java.lang.Class.forName;


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
    public  List<Animal> read() {
        String sql = "load animals documents";
        System.out.println(sql);
        return new ArrayList<>(animals);
    }

    @Override
    public void deleteAll() {
        return;
    }

    @Override
    public void delete_row_by_id(String table_name, int id) {
        return;
    }

}
