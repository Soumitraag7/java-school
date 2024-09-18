import java.util.Scanner;
class di_2nd5
{
    public static void main(String [] args)
    {
        int a,b,c;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER A NO TO KNOW IF THE NO IS DIVISIBLE BY 2 OR 5 OR BY ONE OF 2 OR 5");
        System.out.println("ENTER A=");
        a=in.nextInt();
        b=a%2;
        c=a%5;
        if (b==0 && c==0)
            System.out.println("THE NO IS DEVISIBLE BY 2&5");
        else if (c!=0 && b==0)
            System.out.println("THE NO IS DEVISIBLE BY 2 BUT NOT BY 5");
        else if(b!=0&&c==0)
            System.out.println("THE NO IS DEVISIBLE BY 5 BUT NOT BY 2");
        else
        System.out.println("not div");
    }
}