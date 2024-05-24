public class Manager extends Worker{
    private float annualBonus;
    private boolean  isGeneralManager;

    public Manager(String name, int age, String email,String position, float salary,float annualBonus) {
        super(name, age, email, position, salary);
        this.annualBonus = annualBonus;
    }

    private float getAnnualBonus() {
        return annualBonus;
    }

    private boolean isGeneralManager() {
        return isGeneralManager;
    }

    private void setAnnualBonus(float annualBonus) {
        this.annualBonus = annualBonus;
    }

    private void setGeneralManager(boolean generalManager) {
        isGeneralManager = generalManager;
    }


}
