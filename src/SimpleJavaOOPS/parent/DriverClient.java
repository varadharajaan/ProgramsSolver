package SimpleJavaOOPS.parent;


import SimpleJavaOOPS.packageA.DailyWages;
import SimpleJavaOOPS.packageA.MonthlyWages;
import SimpleJavaOOPS.packageA.ShareHolders;

public class DriverClient {

    public static void main(String[] args) {
        
        DailyWages dw =  new DailyWages(0, null, null, null);
        MonthlyWages mw = new MonthlyWages(0, null, null, null);
        
        dw.setId(1);
        dw.setName("i am daily wages employee");
        dw.setGender("male");
        dw.daysPresent();
        dw.salaryCalulation();
        System.out.println(dw);
        
        mw.setId(11);
        mw.setName("i am monthly wages employee");
        mw.setCity("chennai");
        mw.daysPresent();
        mw.salaryCalulation();
        System.out.println(mw);
        
        
        ShareHolders sh = new ShareHolders(0, null, null, null);
        sh.daysPresent();
        sh.salaryCalulation();

        
    }

}
