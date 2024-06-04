package rlabs;
import rlabs.dao.AnimaFileDAO;
import rlabs.dao.AnimalDAO;
import rlabs.dao.AnimalsMYSQLDBDAO;
import rlabs.dao.AnimalsMongoDBDAO;
import java.util.Scanner;


public class Main {
    public static AnimalDAO animalsDAO ;
    public static void main(String[] args) {
        System.out.println("Which datasource to connect [1. file, 2. mysql, 3. mongo");
        Scanner dbscanner = new Scanner(System.in);
        String dbinput = dbscanner.nextLine();
        switch (dbinput)
        {
            case "1":
                animalsDAO = new AnimaFileDAO();
                break;
            case "2":
                animalsDAO = new AnimalsMYSQLDBDAO();
                break;
            case "3":
                animalsDAO = new AnimalsMongoDBDAO();
                break;
        }
        readAnimals();
        while (true)
        {
            System.out.println("Enter you choice:");
            System.out.println("1. Adding new animal");
            System.out.println("2. Print all animals");
            System.out.println("3. Import from file");
            System.out.println("q/Q. Exit");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input)
            {
                case "1":
                    addNewAnimal();
                    break;
                case "2":
                    printAllAnimals();
                    break;
                case "3":
                    readAnimals();
                    break;
                case "q":
                case "Q":
                    quit();
                    break;
            }
        }
    }


    private static void readAnimals() {
        for(Animal animal : animalsDAO.read())
        {
            myZoo.add(animal);
        }
    }


    private static Zoo myZoo = new Zoo("Lala land","Haifa");
    private static void quit() {
        System.out.println("Are you sure you want to quit? Y/N");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.toLowerCase().startsWith("y"))
        {
            System.out.println("Bye");
            System.exit(0);
        }
    }

    private static void printAllAnimals() {
        myZoo.printAllAnimals();
    }

    public static void addNewAnimal()
    {
        System.out.println("Which type of animal do you want to add?");
        System.out.println("1. Lion");
        System.out.println("2. Dog");
        System.out.println("3. Snake");
        System.out.println("4. Cat");
        Scanner scanner = new Scanner(System.in);
        String animalType = scanner.nextLine();
        String name = getInfoFromUser("Enter the animal name");
        String color = getInfoFromUser("Enter the animal color");
        int age = getAgeFromUser();
        Animal animal = AnimalsFactory.createAnimal(animalType,name);
        animal.setColor(color);
        animal.setAge(age);
        myZoo.add(animal);
    }


    public static String getInfoFromUser(String title)
    {
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getAgeFromUser()
    {
        System.out.println("Please enter the age:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
