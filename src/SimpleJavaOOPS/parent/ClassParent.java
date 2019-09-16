package SimpleJavaOOPS.parent;

public class ClassParent {

    private String name;
    private int id;
    private String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String printname() {
        System.out.println("parent method called");
        return "success";
    }


}
