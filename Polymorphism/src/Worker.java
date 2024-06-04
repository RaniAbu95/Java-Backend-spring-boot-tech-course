public class Worker extends Person{

    private String position;
    private float salary;

    public Worker(String name, int age, String email,String position, float salary) {
        super(name,age,email);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public float getSalary() {
        return salary;
    }

    public void setPosition(String position) {
        if(position==null || "".equals(position))
        {
            return;
        }
        this.position = position;
    }

    public void setSalary(int salary) {
        if(salary>0) {
            this.salary = salary;
        }
        throw new RuntimeException();
    }

    public float getAnnualSalary()
    {
        return this.salary * 12;
    }

    public String toString()
    {
        return this.getName()+"    "+this.getPosition()+"("+this.getClass().getCanonicalName()+")        "+this.getSalary();
    }
}
