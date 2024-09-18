import java.util.Scanner;
class allin1
{
    public static void main (String [] args)
    {
        int a,b,c;
        Scanner in=new Scanner (System.in);
        System.out.println("TO FIND IF THE TRIANGAL IS EQU TRNG OR ISO TRNG OR A SCALENE TRNG");
        System.out.println("ENTER THE 1ST NO");
        a=in.nextInt();
        System.out.println("ENTER THE 2ND NO");
        b=in.nextInt();
        System.out.println("ENTER THE 3RD NO");
        c=in.nextInt();
        if (a+b+c==180)
        {
            if (a!=b & b!=c & a!=c)
            {
                System.out.println("IT IS A SCALIANT TRIANGAL");
            }
            else if (a==b && a==c)
            {
                System.out.println("IT IS A EQUILATERAL TRIANGAL");
            }
            else if (a==b || b==c)
            { 
                System.out.println("IT IS A ISOCELIST TRIANGAL");
            }
        }
        else
        {
            System.out.println("IT IS NOT A TRIANGAL");
        }
    }
}