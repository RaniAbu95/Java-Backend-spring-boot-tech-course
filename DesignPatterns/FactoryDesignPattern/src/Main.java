import java.io.BufferedReader;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
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
                    readAnimalsFromFile();
                    break;
                case "q":
                case "Q":
                    quit();
                    break;
            }
        }
    }

    private static String filePath = "c:\\temp\\animals-data\\animals.txt";
    private static void readAnimalsFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String animalType = values[0].trim();
                String name = values[1].trim();
                int age = Integer.parseInt(values[2].trim());
                String color = values[3];
                setupAnimalInfo(animalType, name,color,age);
            }
        } catch (IOException e) {
            e.printStackTrace();
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
        /*switch (animalType)
        {
            case "1":
                String name = getInfoFromUser("Enter the lion name");
                Lion lion = new Lion(name);
                String color = getInfoFromUser("Enter the lion color");
                lion.setColor(color);
                int age = getAgeFromUser();
                lion.setAge(age);
                myZoo.add(lion);
                break;
            case "2":
                String dogName = getInfoFromUser("Enter the dog name");
                Dog dog = new Dog(dogName);
                String dogColor = getInfoFromUser("Enter the dog color");
                dog.setColor(dogColor);
                int dogAge = getAgeFromUser();
                dog.setAge(dogAge);
                myZoo.add(dog);
                break;
            case "3":
                String snakeName = getInfoFromUser("Enter the snake name");
                Snake snake = new Snake(snakeName);
                String snakeColor = getInfoFromUser("Enter the snake color");
                snake.setColor(snakeColor);
                int snakeAge = getAgeFromUser();
                snake.setAge(snakeAge);
                myZoo.add(snake);
                break;
        }*/
        String name = getInfoFromUser("Enter the animal name");
        String color = getInfoFromUser("Enter the animal color");
        int age = getAgeFromUser();
        setupAnimalInfo(animalType, name,color,age);

    }

    public static void setupAnimalInfo(String type, String name, String color, int age)
    {
        Animal animal = AnimalsFactory.createAnimal(type,name);
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
