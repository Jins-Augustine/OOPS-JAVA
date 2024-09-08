abstract class Shape
{
    abstract void numberOfSides();

}
class Rectangle extends Shape
{
    int side;
    Rectangle(int side)
    {
        this.side=side;
    }
    public void numberOfSides()
    {
        System.out.println("I'm rectangle,Number of slides = "+side);
    }
}
class Triangle extends Shape
{
    int side;
    Triangle(int side)
    {
        this.side=side;
    }
    public void numberOfSides()
    {
        System.out.println("I'm Triangle,Number of slides = "+side);
    }
}
class Hexagon extends Shape
{
    int side;
    Hexagon(int side)
    {
        this.side=side;
    }
    public void numberOfSides()
    {
        System.out.println("I'm Hexagon,Number of slides = "+side);
    }
}

public class AbstractExample
{
    public static void main(String[] args)
    {
        Rectangle r=new Rectangle(4);
        r.numberOfSides();
        Triangle t= new Triangle(3);
        t.numberOfSides();
        Hexagon h =new Hexagon(6);
        h.numberOfSides();

    }
}