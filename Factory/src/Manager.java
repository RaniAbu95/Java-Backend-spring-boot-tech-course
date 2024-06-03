public class Manager extends Worker{
    private float annualBonus;
    private boolean hasExtraSalary;


    public Manager(String name, int age, String email,  float salary, float annualBonus, boolean hasExtraSalary) {
        super(name, age, email, "Department Manager", salary);
        this.annualBonus = annualBonus;
        this.hasExtraSalary = hasExtraSalary;
    }

    public float getAnnualBonus() {
        return annualBonus;
    }


    public void setAnnualBonus(float annualBonus) {
        this.annualBonus = annualBonus;
    }

    @Override
    public float getAnnualSalary()
    {
        float delta = annualBonus;
        if(this.hasExtraSalary)
        {
            delta += getSalary();
        }
        return super.getAnnualSalary()+ delta;
    }

    public boolean isHasExtraSalary() {
        return hasExtraSalary;
    }

    public void setHasExtraSalary(boolean hasExtraSalary) {
        this.hasExtraSalary = hasExtraSalary;
    }

    @Override
    public String toString() {
        String data = super.toString();
        if(hasExtraSalary)
        {
            data+= " (with extra salary of "+this.getSalary()+")";
        }
        return data;
    }
}
