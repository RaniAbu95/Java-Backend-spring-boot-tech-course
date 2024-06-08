package rlabs.dao;
import rlabs.Animal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalsMYSQLDBDAO implements AnimalDAO{
    List<Animal> animals = new ArrayList<>();
    Connection conn =null;
    final String table_name="animals";
    public AnimalsMYSQLDBDAO(String dbname) {

        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            this.conn = connect_to_db(dbname, "postgresql",table_name);
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    public Connection connect_to_db(String dbname, String user,String table_name){
        try{
            Class.forName("org.postgresql.Driver");
            this.conn= DriverManager.getConnection("jdbc:"+user+"://localhost:5433/"+dbname);
            if(this.conn!=null){
                System.out.println("Connected to database");
            }
            DatabaseMetaData metaData = conn.getMetaData();
            ResultSet resultSet = metaData.getTables(null, null, table_name, null);
            if (resultSet.next()) {
                System.out.println("Table 'animals' exists in the database.");
            } else {
                create_table();
            }

        } catch (Exception e){
            System.out.println(e);
        }
    return conn;
    }

    public void create_table(){
        String query = "create table "+this.table_name+" (anpid SERIAL,name VARCHAR(100), species VARCHAR(100),primary key (anpid))";
        try{
        Statement stmt = this.conn.createStatement();
        stmt.executeUpdate(query);
        System.out.println("Table created");

        } catch (Exception e){
            System.out.println(e);
        }
    }




    public void delete_row_by_id(String table_name, int id ){
        Statement statement = null;
        try{
            String query = String.format("delete from %s where anpid = %s",table_name,id);
            statement = this.conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("row deleted");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void deleteAll(){
        Statement stmt = null;

        try {
            stmt = this.conn.createStatement();

            // Drop the specified table
            String dropTableQuery = "DROP TABLE " + this.table_name;
            stmt.executeUpdate(dropTableQuery);
            System.out.println("Dropped table: " + this.table_name);
            System.out.println("Table dropped");

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void save(List<Animal> animals) {
        Animal animal = animals.get(animals.size() - 1);
        Statement statement = null;
        String table_name = "animals";

        try{
            String query = String.format("insert into %s(name,species) values('%s', '%s');",table_name,animal.getName(),animal.getType());
            statement =this.conn.createStatement();
            statement.executeUpdate(query);
        } catch (Exception e){
            System.out.println(e);
        }
        String sql = "insert into animals";
        System.out.println(sql);
        animals.clear();
        animals.add(animal);
    }


    public  List<Animal> read(){
        Statement statement;
        ResultSet rs=null;
        try {
            String query=String.format("select * from %s",table_name);
            System.out.println(query);
            statement=this.conn.createStatement();
            rs=statement.executeQuery(query);
            while(rs.next()){
                System.out.print("<anpid: "+rs.getString("anpid")+", ");
                System.out.print("name: "+rs.getString("name")+", ");
                System.out.println("species: "+rs.getString("species")+">");

            }
        }
        catch (Exception e){
            System.out.println(e);
        }

        return new ArrayList<>(animals);
    }

}
