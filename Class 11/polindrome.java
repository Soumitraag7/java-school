import java .util.*;
class polindrome
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int i,d,r=0,a;
        System.out.println("Enter the 3 digit number :");
        i=in.nextInt();
        a=i;
        while (i>0)
        {
            d=i%10;
            r=r*10+d;
            i=i/10;
        }
        if (r==a)
        {
            System.out.println ("The number is Palindrome number");
        }
        else
        {
            System.out.println ("The number is not Palindrome number");
        }
    }
}

        