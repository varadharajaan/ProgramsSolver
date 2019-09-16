package SimpleJavaOOPS.packageA;

public class DailyWages extends Employees {
    
    public DailyWages(int id, String name, String mail, String salary) {
        super(id, name, mail, salary);
    }

    private String gender;
    private String workingHours;
    
    @Override
    public void salaryCalulation() {
        
        System.out.println("dailyWages salary present overriden method");
        
    }
    
    @Override
    public int daysPresent() {
        
        System.out.println("DailyWages  present overriden method");
        return 0;
    }

    @Override
    public String toString() {
        return "DailyWages [gender=" + gender + ", workingHours=" + workingHours + "]";
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    
    
}
