package rlabs;
public class Cat extends Animal{
    private static final String CAT = "4";
    private static final int LEGS = 4;
    public Cat(String name) {
        super(name, LEGS);
    }

    @Override
    public String introduce() {
        return "Type: "+this.getType()+", Name: "+this.getType()+", age:"+this.getAge()+", color:"+this.getColor()+", legs:"+this.getLegs();
    }

    @Override
    public void makeSound() {
        System.out.println("Miao");
    }

    @Override
    public String getType() {
        return this.my_animals_type.get(CAT);
    }
}
