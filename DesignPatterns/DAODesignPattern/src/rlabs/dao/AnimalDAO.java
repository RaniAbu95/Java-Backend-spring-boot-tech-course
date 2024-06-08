package rlabs.dao;

import rlabs.Animal;

import java.util.List;

public interface AnimalDAO {  // C.R.U.D.   Create Read Update Delete

    public void save(List<Animal> animals);
    public List<Animal> read();
    public void deleteAll();

    void delete_row_by_id(String table_name, int id );
}
