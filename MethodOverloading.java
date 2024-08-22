import java.util.Scanner;
class Method{
    void area(int l,int b)
    {
        System.out.println("Area of rectangle is "+l*b);
    }
    void area(double r)
    {
        System.out.println("Area of circle is "+3.14*r*r);
    }
    void area(double h,double b)
    {
        System.out.println("Area of triangle is "+0.5*b*h);
    }
}

public class MethodOverloading
{
    public static void main(String[] args)
    {   
        Scanner sc=new Scanner(System.in);
        Method m =new Method();

        System.out.println("Enter the radius of circle");
        m.area(sc.nextDouble());

        System.out.println("Enter the length and breadth of rectangle");
        m.area(sc.nextInt(),sc.nextInt());
        
        System.out.println("Enter the height and base of triangle");
        m.area(sc.nextDouble(),sc.nextDouble());
    }
}