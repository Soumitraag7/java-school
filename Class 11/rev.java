


import java.util.Scanner;
class rev
{
    public static void main(String [] args)
    {
        int a,b;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a number");
        a=in.nextInt();
        int sum=0;
        while(a>0)
        {
            b=a%10;
            a/=10;
            sum+=b;
        }
        System.out.println("Reverse of the number is= "+sum);
    }
}