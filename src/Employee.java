public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    double tax;
    double bonus;
    double raiseSalary;
    double salaryWithBonusAndTax;
    double totalSalary;


    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

        tax = tax(salary);
        bonus = bonus(workHours);
        raiseSalary = raiseSalary(hireYear,salary);
        salaryWithBonusAndTax = salary - tax + bonus;
        totalSalary = salaryWithBonusAndTax + raiseSalary;

    }

    double tax(double salary) {
        double tax = 0;
        if (salary < 1000 && salary >= 0)
            tax = 0;
        else if (salary >= 1000)
            tax = salary * 0.03;
        else System.out.println("Please enter a valid salary value");

        return tax;
    }

    double bonus(int workHours) {
        double bonus = 0;
        if (workHours > 40)
            bonus = (workHours - 40) * 30;

        return bonus;
    }

    double raiseSalary(int hireYear, double salary) {
        double raiseSalary = 0;
        if ((2021 - hireYear) < 10)
            raiseSalary = 0.05;
        else if ((2021 - hireYear) < 20)
            raiseSalary = 0.1;
        else raiseSalary = 0.15;

        return salary * raiseSalary;
    }

    @Override
    public String toString() {
        return
                " Name = '" + name + '\'' + "\n" +
                        " Salary = " + salary + "\n" +
                        " Work Hours = " + workHours + "\n" +
                        " Hire Year = " + hireYear + "\n" +
                        " Tax = " + tax + "\n" +
                        " Bonus = " + bonus + "\n" +
                        " Raise Salary = " + raiseSalary + "\n" +
                        " Salary With Bonus And Tax = " + salaryWithBonusAndTax + "\n" +
                        " Total Salary = " + totalSalary + "\n"
                ;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("eBebek", 10000, 50, 2000);
        System.out.println(employee1);

        Employee employee2 = new Employee("RK",900,35,2020);
        System.out.println(employee2);
    }
}
