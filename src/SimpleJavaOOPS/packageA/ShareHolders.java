package SimpleJavaOOPS.packageA;

public class ShareHolders extends Employees {

    public int amountinvested;


    public ShareHolders(int id, String name, String mail, String salary) {
        super(id, name, mail, salary);
    }

    public void printnameFOrholders() {
        System.out.println("i am share holder");
    }
}
