import java.util.Scanner;
class rad
{
    public static void main()
    {
        double n;
        Scanner in=new Scanner(System.in);
        
        System.out.println("dig a");
        n=in.nextDouble();
        
        double r=Math.atan(n);
        double d=(r*7.0*180.0)/22.0;
        
        System.out.println(d);
    }
}