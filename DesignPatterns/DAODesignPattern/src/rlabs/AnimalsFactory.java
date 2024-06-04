package rlabs;
public class AnimalsFactory {


    public static Animal createAnimal(String type, String name)
    {
        switch (type)
        {
            case "1":
                return new Lion(name);
            case "2":
                return new Dog(name);
            case "3":
                return new Snake(name);
            case "4":
                return new Cat(name);
        }
        return null;
    }
}
