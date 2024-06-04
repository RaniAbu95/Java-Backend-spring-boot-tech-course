public class Lion extends Animal{
    private static final int LEGS = 4;

    public Lion(String name) {
        super(name, LEGS);
    }

    @Override
    public void makeSound() {
        System.out.println("Waaaaa");
    }
}
