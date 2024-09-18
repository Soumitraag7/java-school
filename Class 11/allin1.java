import java.util.Scanner;
class allin1
{
    public static void main (String [] args)
    {
        int a,b,c;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER THREE ANGLSE'S OF A TRIANGAL TO KONW IF THE TRIANGAL IS EQA TRNG OR ISO TRNG OR SCANIANT TRNG");
        System.out.println("ENTER THE 1ST ANGLE");
        a=in.nextInt();
        System.out.println("ENTER THE 2ND ANGLE");
        b=in.nextInt();
        System.out.println("ENTER THE 3RD ANGLE");
        c=in.nextInt();
        if (a+b+c==180)
        {
            if (a==b && a==c)
            {
                System.out.println("IT IS A EQUILATERAL TRIANGAL");
            }
            if (a!=b && b!=c && a!=c && a+b+c==180)
            {
                System.out.println("IT IS A SCALENT TRIANGAL");
            }
            if (a==60 && b==60 && c==60)
            {
                System.out.println("IT IS NOT A ISO TRNG");
            }
             if (a==b || b==c || c==a)
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