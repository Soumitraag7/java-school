import java.util.Scanner;
class even_or_odd
{
    public static void main (String [] args)
    {
        int a,b;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER A NO TO FIND THE NO IS EVEN OR ODD");
        a=in.nextInt();
        //b=a%2;
        if (a%2==0)
        {
            System.out.println("It's a even no");
        }
        else
        {
            System.out.println("It's a odd no");
        }
    }
}