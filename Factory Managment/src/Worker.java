public class Worker extends Person{

    private String position;
    private float salary;

    public Worker(String name, int age, String email,String position, float salary) {
        super(name,age,email);
        this.position = position;
        this.salary = salary;
    }

    private String getPosition() {
        return position;
    }

    public float getSalary() {
        return salary;
    }

    private void setPosition(String position) {
        this.position = position;
    }

    private void setSalary(int salary) {
        this.salary = salary;
    }
}
