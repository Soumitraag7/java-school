import java.util.Scanner;
class rendom
{
    public static void main()
    {
        double n;
        Scanner in=new Scanner(System.in);
        
        System.out.println("enter a");
        n=in.nextInt();
        System.out.println("enter b");
        int m=in.nextInt();
        double palim=(int)((Math.random()*(n-m))+m);
        System.out.println(palim);
    }
}