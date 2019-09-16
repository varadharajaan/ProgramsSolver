package SimpleJavaOOPS.packageA;

    


	public class Employees {
    private int id;
    private String name;
    private String mail;
    private String salary;
    
    public Employees ( int id, String name, String mail, String salary) {
        this.id= id;
        this.name=name;
        this.mail= mail;
        this.salary = salary; 
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    
    
    public void salaryCalulation() {
        
        System.out.println("1000RS present default method");
        
    }
    public int daysPresent() {
        
        System.out.println("all days present default method");
        return 0;
    }
    @Override
    public String toString() {
        return "Employees [id=" + id + ", name=" + name + ", mail=" + mail + ", salary=" + salary + "]";
    }

	}

