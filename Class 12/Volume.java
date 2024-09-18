/*Functon overloading
 * 
 * output:
 * 
 * Enter the value of side of a cube
3
Enter the value of radius of sphere
2
Enter the value of side of a cuboid
2
1
2
Area of the cube= 27
Area of the sphere= 24.0
Area of the cuboid= 4.0

 * 
 */

import java.util.Scanner;
class Volume
{
    public int volume(int s)
    {
        int vc=s*s*s;
        return (vc);
    }
    public double volume(double r)
    {
        double vs=(4/3)*(22/7)*r*r*r;
        return (vs);
    }
    public double volume(double l, double b, double h)
    {
        double vcd=l*b*h;
        return (vcd);
    }
    public static void main (String [] args)
    {
        int c;
        double r1,l1,b1,h1;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the value of side of a cube");
        c=in.nextInt();
        System.out.println("Enter the value of radius of sphere");
        r1=in.nextDouble();
        System.out.println("Enter the value of side of a cuboid");
        l1=in.nextDouble();
        b1=in.nextDouble();
        h1=in.nextDouble();
        Volume ob=new Volume();
        int k=ob.volume(c);
        double l=ob.volume(r1);
        double m=ob.volume(l1,b1,h1);
        System.out.println("Area of the cube= "+k);
        System.out.println("Area of the sphere= "+l);
        System.out.println("Area of the cuboid= "+m);
    }
}