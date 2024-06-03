package rlabs;
public class Dog extends Animal{
    private static final int LEGS = 4;
    private String owner;
    public Dog(String name) {
        super(name, LEGS);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void makeSound() {
        System.out.println("Howhow");
    }

    @Override
    public String getType() {
        return "2";
    }

    public void guard()
    {
        System.out.println("I'm "+this.getName()+" guarding the zoo");
    }
}
