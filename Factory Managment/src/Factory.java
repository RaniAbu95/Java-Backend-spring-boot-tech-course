public class Factory {


    private int registrationNumber;
    private String factoryName;
    private GeneralManager generalManager ;

    private Department[] departments ;
    public Factory(int registrationNumber, String factoryName, GeneralManager generalManager, Department[] departments) {
        this.registrationNumber = registrationNumber;
        this.factoryName = factoryName;
        this.generalManager = generalManager;
        this.departments = departments;
    }

    private int getRegistrationNumber() {
        return registrationNumber;
    }

    private String getFactoryName() {
        return factoryName;
    }

    private Department[] getDepartments() {
        return departments;
    }

    private GeneralManager getGeneralManager() {
        return generalManager;
    }

    private void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    private void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    private void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    private void setGeneralManager(GeneralManager generalManager) {
        this.generalManager = generalManager;
    }

    private int calculateNumberOfEmployers(){
        int numberOfEmployers = 0;
        for (int i =0;i<departments.length;i++){
            numberOfEmployers+=departments[i].getNumberOfEmployers();
        }
        return numberOfEmployers;
    }
    public String toString(){
        String toReturn="";
        toReturn+="------------------Factory Name: "+this.factoryName+"------------------\n"
                +"Registration Number: " + getRegistrationNumber()+
        "\nManager Name: "+this.generalManager.getName()+"\nNumber of employers: "+this.calculateNumberOfEmployers();
        return toReturn;
    }

    public void printDepartmentsInfo(){
        for(int i =0;i<departments.length;i++){
            System.out.println(departments[i].printDepartmentsInfo());
        }
    }

    public void averageSalaryReport(){
        float allDepartmentsAvgSalary = 0;
        for (int i=0;i<departments.length;i++){
            allDepartmentsAvgSalary+=departments[i].departmentAvgSalary();
        }
        System.out.println( "Factory Average Salary Report: "+allDepartmentsAvgSalary/departments.length+"\n");
    }

}
