class Employee {
     private String firstName;
     private String lastName;
     private double monthlySalary;


    public Employee(String firstName, String lastName, double monthlySalary){
    this.firstName = firstName;
    this.lastName = lastName;
    if (monthlySalary > 0)
        this.monthlySalary = monthlySalary;
    else
        this.monthlySalary = 0.0;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName =lastName;
    }

    public double getMonthlySalary(){
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary){
        if (monthlySalary > 0)
         this.monthlySalary = monthlySalary;
        else
         this.monthlySalary = 0.0;
    }

    public double getYearlySalary(){
        return monthlySalary * 12;
    }
}


public class EmployeeTest{
    public static void main(String[] args)
      Employee emp1 = new Employee("Priya","Avate",30000);
      Employee emp2 = new Employee("Diya","Khamkar",30000);

      System.out.println("Yearly Salary of Employees:");
      System.out.println(emp1.getFirstName() + " " + emp1.getLastName + ": $" + emp1.getYearlySalary());
      System.out.println(emp2.getFirstName() + " " + emp2.getLastName + ": $" + emp2.getYearlySalary());

      emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
      emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

      System.out.println("\nAfter 10% Raise:");
      System.out.println(emp1.getFirstName() + " " + emp1.getLastName + ": $" + emp1.getYearlySalary());
      System.out.println(emp2.getFirstName() + " " + emp2.getLastName + ": $" + emp2.getYearlySalary());
}
