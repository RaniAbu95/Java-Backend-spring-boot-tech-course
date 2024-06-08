package rlabs;
public class Dog extends Animal{
    private static final int LEGS = 4;
    private static final String DOG = "2";
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
    public String introduce() {
        return "Type: "+this.getType()+", Name: "+this.getType()+", age:"+this.getAge()+", color:"+this.getColor()+", legs:"+this.getLegs();
    }

    @Override
    public void makeSound() {
        System.out.println("Howhow");
    }

    @Override
    public String getType() {
            return this.my_animals_type.get(DOG);
    }

    public void guard()
    {
        System.out.println("I'm "+this.getName()+" guarding the zoo");
    }
}
