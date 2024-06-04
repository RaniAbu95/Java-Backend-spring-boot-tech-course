public class GeneralManager extends Manager{

    private float annualBudgetForWaste;
    public GeneralManager(String name, int age, String email, float salary,float bonus,float extraSalary, float annualBudgetForWaste){
        super(name,age,email,salary,bonus, true);
        this.setPosition("CEO");
        this.annualBudgetForWaste=annualBudgetForWaste;
    }

    public float getAnnualBudgetForWaste() {
        return annualBudgetForWaste;
    }
    public void setAnnualBudgetForWaste(float annualBudgetForWaste) {}

    public float getAnnualSalary()
    {
        return super.getAnnualSalary()+annualBudgetForWaste;
    }
}
