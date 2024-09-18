/*function overloading
 * 
 * output:
 * 
 * Area of the circle= 84.27
Area of the square= 64
Area of the rectangle= 22.32

 * 
 */

import java.util.Scanner;
class calculate
{
    public double area(double r)
    {
        double ar1=(22/7)*r*r;
        return (ar1);
    }
    public int area(int s)
    {
        int ar2=s*s;
        return (ar2);
    }
    public double area(double a,double b)
    {
        double ar3=a*b;
        return (ar3);
    }
    public static void main (String [] args)
    {
        int n;
        double m,p;
        calculate ob=new calculate();
        m=ob.area(5.3);
        n=ob.area(8);
        p=ob.area(6.2,3.6);
        System.out.println("Area of the circle= "+m);
        System.out.println("Area of the square= "+n);
        System.out.println("Area of the rectangle= "+p);
    }
}