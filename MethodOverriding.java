import java.util.Scanner;
class Employee
{
    double salary,DA,HRA,grossSalary;
    Employee(double salary,double DA,double HRA)
    {
        this.salary=salary;
        this.DA=DA;
        this.HRA=HRA;
    }
    void display()
    {
        System.out.println("......EMPLOYEE......");

    }
    void calcSalary()
    {
        grossSalary=salary+salary*(DA/100)+salary*(HRA/100);
        System.out.println("Gross Salary : "+grossSalary);
    }
}
class Engineer extends Employee{
    Engineer(double salary,double DA,double HRA)
    {
        super(salary,DA,HRA);

    }
    void display()
    {
        super.display();
        super.calcSalary();
        System.out.println("......ENGINEER......");
    }
    void calcSalary()
    {
        System.out.println("Gross Salary :"+grossSalary*2);
    }
}

public class MethodOverriding
{
    public static void main(String[] args)
    {
        double salary,DA,HRA;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the basic salary of the Employee");
        salary=sc.nextDouble();
        System.out.println("Enter the DA% of the Emplyee ");
        DA=sc.nextDouble();
        System.out.println("Enter the HRA% of the Employee");
        HRA=sc.nextDouble();
        Engineer e=new Engineer(salary,DA,HRA);
        e.display();
        e.calcSalary();
        sc.close();
    }
}