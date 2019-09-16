package SimpleJavaOOPS.packageA;

public class ShareHolders extends Employees {

    public ShareHolders(int id, String name, String mail, String salary) {
		super(id, name, mail, salary);
	}


	public int amountinvested;
    
    
    public void printnameFOrholders() {
        System.out.println("i am share holder");
    }
}
