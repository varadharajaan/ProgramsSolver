package SimpleJavaOOPS.packageA;

public class EmployeeContractor implements employeesInterface {

    @Override
    public void salaryCalulation() {

        System.err.println("i am contractor- salary calultion");

    }

    @Override
    public int daysPresent() {

        System.out.println("i am contractor - days present caulation");
        return 0;
    }

}
