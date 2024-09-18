import  java.util.Scanner;
class Point1
{
    double x,y;
    Point1()
    {
        x=0;
        y=0;
    }
    public void readpoint()
    {
         Scanner in=new Scanner (System.in);
         System.out.println("Enetr the coordinate of x-axis");
         x=in.nextDouble();
         System.out.println("Enetr the coordinate of y-axis");
         y=in.nextDouble();
    }
    Point1 midpoint(Point1 a, Point1 b)
    {
        Point1 M=new Point1();
        M.x=(a.x+b.x)/2.0;
        M.y=(a.y+b.y)/2.0;
        return (M);
    }
    public void displaypoint()
    {
        System.out.println(x+","+y);
    }
    public static void main(String[]args)
    {
         Point1 ob1=new Point1();
         Point1 ob2=new Point1();
         
         ob1.readpoint();
         ob2.readpoint();
         
         Point1 ob3=ob1.midpoint(ob1,ob2);
         
         System.out.println("Point 1: ");
         ob1.displaypoint();
         
         System.out.println("Point 2:");
         ob2.displaypoint();
         
         System.out.println("Midpoint");
         ob3.displaypoint();
    }
}