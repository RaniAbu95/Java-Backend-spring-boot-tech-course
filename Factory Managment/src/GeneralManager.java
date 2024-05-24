public class GeneralManager extends Manager{
    private float extraSalary;
    private float annualBudgetForWaste;
    public GeneralManager(String name, int age, String email,String position, float salary,float bonus,float extraSalary, float annualBudgetForWaste){
        super(name,age,email,position,salary,bonus);
        this.extraSalary = salary;
        this.annualBudgetForWaste=annualBudgetForWaste;
    }
    private float getExtraSalary() {
        return extraSalary;
    }
    private void setExtraSalary(float extraSalary) {
        this.extraSalary = extraSalary;
    }

    private float getAnnualBudgetForWaste() {
        return annualBudgetForWaste;
    }
    private void setAnnualBudgetForWaste(float annualBudgetForWaste) {}
}
