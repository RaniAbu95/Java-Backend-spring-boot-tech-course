package rlabs;
public class Lion extends Animal{
    private static final int LEGS = 4;
    private static final String LION = "1";

    public Lion(String name) {
        super(name, LEGS);
    }

    @Override
    public String introduce() {
        return "Type: "+this.getType()+", Name: "+this.getType()+", age:"+this.getAge()+", color:"+this.getColor()+", legs:"+this.getLegs();
    }

    @Override
    public void makeSound() {
        System.out.println("Waaaaa");
    }

    @Override
    public String getType() {
        return this.my_animals_type.get(LION);
    }
}
