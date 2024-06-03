import java.util.ArrayList;
import java.util.List;

public class Department {

    private String departmentName;
    private List<Worker> workers ;
    private Manager manager ;
    private Enum speciality;
    public Department(String departmentName,  Manager manager,  Enum speciality) {
        this.departmentName = departmentName;
        this.workers = new ArrayList<>();
        this.manager = manager;
        this.speciality = speciality;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void addEmployee(Worker worker)
    {
        if(worker instanceof Manager)
        {
            throw new RuntimeException(); // change this to your custom exception
        }
        if(!this.workers.contains(worker)) {
            this.workers.add(worker);
            return;
        }
        throw new RuntimeException(); // change this to your custom exception
    }

    public Worker get(int index)
    {
        if(this.workers.size()>index) {
            return this.workers.get(index);
        }
        throw new RuntimeException(); // change this to your custom exception
    }

    public Enum getSpeciality() {
        return speciality;
    }

    public Manager getManager() {
        return manager;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setManager(Manager manager) {
        if(manager instanceof GeneralManager)
        {
            throw new RuntimeException();
        }
        this.manager = manager;
    }

    public void setWorkers(Worker[] workers) {
        if(workers!=null) {
            for (Worker worker : workers) {
                if (worker != null) {
                    this.addEmployee(worker);
                }
            }
        }
    }

    public void setSpeciality(Enum speciality) {
        this.speciality = speciality;
    }
    public int getNumberOfEmployers(){
        return workers.size();
    }

    public String printDepartmentsInfo(){
        String info ="-------- Department Information "+this.departmentName+" ------\n";
        info+="Worker Name,     Position(instance-of),       Salary\n";
        for(int k =0;k<workers.size();k++){
            info+=get(k)+"\n";
        }
        info += this.manager;
        return info;
    }

    public int departmentAvgSalary(){
        int sum = 0;
        for(int k =0;k<workers.size();k++){
            sum+=get(k).getAnnualSalary();
        }
        sum += this.manager.getAnnualSalary();
        return sum/(workers.size()+1);
    }
}
