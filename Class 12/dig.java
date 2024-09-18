import java.util.Scanner;
class dig
{
    public static void main()
    {
        double n;
        Scanner in=new Scanner(System.in);
        
        System.out.println("dig a");
        n=in.nextDouble();
        
        double r=(22.0/(7.0*180.0))*n;
        double d=Math.sin(r);
        
        System.out.println(d);
    }
}