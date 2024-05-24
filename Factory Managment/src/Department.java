public class Department {

    private String departmentName;
    private Worker[] workers ;
    private Manager manager ;
    private Enum speciality;
    public Department(String departmentName, Worker[] workers, Manager manager,  Enum speciality) {
        this.departmentName = departmentName;
        this.workers = workers;
        this.manager = manager;
        this.speciality = speciality;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    private Worker[] getWorkers() {
        return workers;
    }

    private Enum getSpeciality() {
        return speciality;
    }

    private Manager getManager() {
        return manager;
    }

    private void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    private void setManager(Manager manager) {
        this.manager = manager;
    }

    private void setWorkers(Worker[] workers) {
        this.workers = workers;
    }

    private void setSpeciality(Enum speciality) {
        this.speciality = speciality;
    }
    public int getNumberOfEmployers(){
        return workers.length;
    }

    public String printDepartmentsInfo(){
        String info ="-------- Department Information "+this.departmentName+" ------\n";
        info+="Worker Name       Salary\n";
        for(int k =0;k<workers.length;k++){
            info+=workers[k].getName()+"        "+workers[k].getSalary()+"\n";
        }
        return info;
    }

    public int departmentAvgSalary(){
        int sum = 0;
        for(int k =0;k<workers.length;k++){
            sum+=workers[k].getSalary();
        }
        return sum/workers.length;
    }
}
