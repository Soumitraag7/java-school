import java.util.Scanner;
class pythogorain
{
    public static void main (String [] args)
    {
        int a,b,c;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER THREE NO TO FIND THE PYTHOGORAIN TRIPLLET");
        System.out.println("ENTER A=");
        a=in.nextInt();
        System.out.println("ENTER B=");
        b=in.nextInt();
        System.out.println("ENTER C=");
        c=in.nextInt();
        //a*a=(b*b)+(c*c);
        if (a*a==((b*b)+(c*c)))
        {
            System.out.println("IT IS A PYTHOGORAIN TRIPLLET");
        }
        else
        {
            System.out.println("IT IS NOT A PYTHOGORAIN TRIPLLET");
        }
    }
}