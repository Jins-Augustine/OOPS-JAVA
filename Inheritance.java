import java.util.Scanner;
class Employee //super class
{
    String name;
    int age;
    long phonenumber;
    String address;
    float salary;
    
    Employee(String name1,int age1,long phonenumber1,String address1,float salary1)
    {
        name=name1;
        age=age1;
        phonenumber=phonenumber1;
        address=address1;
        salary=salary1;

    }
    void printemployee()
    {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Phonenumber :"+phonenumber);
        System.out.println("Address :"+address);
    }
    void printsalary()
    {
        System.out.println("Salary :"+salary);
    }
}

class Officer extends Employee
{
    String specialization;

    Officer(String name1,int age1,long phonenumber1,String address1,float salary1,String specialization)
    {
        super(name1,age1,address1,phonenumber1,salary1);
        specialization=specialization1;
    }
    void Printspecialization()
    {
        System.out.println("Specialization :"+specialization);
    }
    
}

class Manager extends Employee
{
    String department;
    Manager(String name1,int age1,long phonenumber1,String address1,float salary1,String deparment1)
    {
        super(name1,age1,phonenumber1,address1,salary1);
        deparment=department1;
    }
    void department()
    {
        System.out.println("Department :"+department);
    }
}

public class inheritance
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int age;
        long phonenumber;
        String name,address,specialization,department;
        float salary;

        System.out.println("***ENTER THE DETAILS OF OFFICER***");
        System.out.println("Enter the name :");
        name=sc.nextLine();
        System.out.println("Enter the age :");
        age=sc.nextInt();
        System.out.println("Enter the phonenumber :");
        phonenumber=sc.nextLong();
        System.out.println("Enter the address :");
        address=sc.nextLine();
        System.out.println("Enter the salary :");
        salary=sc.nextFloat();
        System.out.println("Enter the specialization :");
        specialization=sc.nextLine();

        Officer o = new Officer(name,age,phonenumber,address,salary,specialization);



    }
}
