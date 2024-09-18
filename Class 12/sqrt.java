import java.util.Scanner;
class sqrt
{
    public static void main()
    {
        double z;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a no");
        z=in.nextDouble();
        double palim=Math.sqrt(z);
        System.out.println(palim);
        
    }
}