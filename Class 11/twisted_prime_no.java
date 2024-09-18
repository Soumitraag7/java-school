import java.util.Scanner;
class twisted_prime_no
{
    public static void main(String[]args)
    {
        int a,b,n,i,z=0,rev=0,z1=0;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER n=");
        a=in.nextInt();
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            {
               z++;
            }
        }
        if (z==2)
        {
             while(a>0)
             {
                 b=a%10;
                 rev=rev*10+b;
                 a/=10;
                }
                for(i=1;i<=rev;i++)
                {
                 if (rev%i==0)
                 {
                     z1++;
                 }
             }
            }
             if(z1==z)
             {
                 System.out.println("IT'S A TWISTED PRIME NO");
             }
        else
        {
            System.out.println("IT IS NOT A TWISTED PRIME NO");
        }
    }
}