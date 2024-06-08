public class Cat extends Animal{

    private static final int LEGS = 4;
    public Cat(String name) {
        super(name, LEGS);
    }

    @Override
    public void makeSound() {
        System.out.println("Miao");
    }
}
