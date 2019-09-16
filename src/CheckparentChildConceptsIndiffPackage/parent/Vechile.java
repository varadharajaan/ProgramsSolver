package CheckparentChildConceptsIndiffPackage.parent;

import java.util.Date;

public class Vechile {
    
    private int id;
    private String name;
    private String milage;
    private Date date;
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
    public String getMilage() {
        return milage;
    }
    public void setMilage(String milage) {
        this.milage = milage;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    
    public Vechile () {
        
    }
    public Vechile(int id, String name, String milage, Date date) {
        super();
        this.id = id;
        this.name = name;
        this.milage = milage;
        this.date = date;
    }
    
    public  String checkMilage() {
        return "100kmpl";
    }

}
