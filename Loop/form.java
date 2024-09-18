package loop;
import java.util.*;
class form
{
    public static void main(String []args)
    {
        int a,i,j,n;
        Scanner in=new Scanner(System.in);
        System.out.println("CHOOSE 1 FOR FOR LOOP, 2 FOR WHILE LOOP, 3 FOR DO-WHILE LOOP");
        a=in.nextInt();
        System.out.println("N=");
        n=in.nextInt();
        switch(a)
        {
         case 1:
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("1");
            }
            System.out.println("");
        }
        break;
        case 2:
        i=1;
        while(i<=n)
        {
            j=1;
            while(j<=i)
            {
                System.out.print("1");
                j++;
            }
            System.out.println("");
            i++;
        }
        break;
        case 3:
        i=1;
        do
        {
            j=1;
            do
            {
                System.out.print("1");
                j++;
            }
            while(j<=i);
            i++;
        }
            while(i<=n);
        default:
        System.out.println("WRONG INPUT");
        }
    }
}
            