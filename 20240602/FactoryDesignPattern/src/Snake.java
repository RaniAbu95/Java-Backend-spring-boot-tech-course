public class Snake extends Animal{
    private static final int LEGS = 0;
    public Snake(String name) {
        super(name, LEGS);
    }

    @Override
    public void makeSound() {
        System.out.println("Pthhhhh");
    }
}
