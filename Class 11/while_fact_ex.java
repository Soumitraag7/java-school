import java .util.*;
class while_fact_ex
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        int a,i=1,sum=0;
        System.out.println ("Enter the number :");
        a=in.nextInt();
        while (i<a)
        {
            if(a%i==0)
            {
                sum=sum+i;
            }
            i++;
        }
        if (sum==a)
        {
            System.out.println("It is a perfect number ");
        }
            else
            {
             System.out.println("It is not a perfect number ");
            }
        }
    }

            