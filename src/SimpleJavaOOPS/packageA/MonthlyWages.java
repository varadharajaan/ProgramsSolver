package SimpleJavaOOPS.packageA;

public class MonthlyWages extends Employees {


    private String city;
    private String location;
    public MonthlyWages(int id, String name, String mail, String salary) {
        super(id, name, mail, salary);
    }

    public void alldayScuess() {
        System.out.println("success");
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


}
