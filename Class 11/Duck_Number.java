import java .util.*;
class Duck_Number
{
    public static void main (String args [])
    {
        Scanner in =new Scanner (System.in);
        int i,a,c=0;
        System.out.println ("Enter your number :");
        i=in.nextInt();
        while (i>0)
        {
            a=i%10;
            if (a==0)
            {
                c=1;
                break;
            }
            i=i/10;
        }
        if (c==1)
        {
            System.out.println ("It is a duck number");
        }
        else 
        {
             System.out.println ("It is not a duck number");
            }
        }
    }

            
            