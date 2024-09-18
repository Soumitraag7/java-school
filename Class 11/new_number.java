import java .util.*;
class new_number
{
    public static void main (String args[])
    {
        Scanner in =new Scanner (System.in);
        int a,b,c,e,r=0,i;
        System.out.println("Enter the number :");
        a=in.nextInt();
        while (a>0)
        {
            i=a%10;
            if (a>0)
            {
                r=r*10/i;
            }
            i=i/10;
            while (r>0)
            {
                b=r%10;
                e=b*10+b;
                r=r/10;
            }
            System.out.print ("Your new number :");
        }
    }
}

         
            
        
            
            
