package rlabs;
public class Snake extends Animal{
    private static final int LEGS = 0;
    private static final String SNAKE = "3";
    public Snake(String name) {
        super(name, LEGS);
    }

    @Override
    public String introduce() {

        return "Type: "+this.getType()+", Name: "+this.getType()+", age:"+this.getAge()+", color:"+this.getColor()+", legs:"+this.getLegs();

    }

    @Override
    public void makeSound() {
        System.out.println("Pthhhhh");
    }

    @Override
    public String getType() {
        return this.my_animals_type.get(SNAKE);
    }
}
