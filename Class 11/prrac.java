import java.util.Scanner;
class prrac
{
    public static void main (String [] args)
    {
        int i,j,add=0,n,s;
        Scanner in=new Scanner(System.in);
        System.out.println("Eneter 1 if you want to use the first case and enter 2 for using 2nd case");
        s=in.nextInt();
        switch(s)
        {
            case 1:
            System.out.println("Enter the no of lines you want");
            n=in.nextInt();
            for(i=n;i>=1;i--)
            {
                for (j=1;j<=i;j++)
                {
                    System.out.print(i);
                }
                System.out.println();
            }
            for (i=2;i<=n;i++)
            {
                for (j=1;j<=i;j++)
                {
                    System.out.print(i);
                }
                System.out.println();
            }
            break;
            case 2:
            System.out.println("Enter the no you want to find weather the no is perfect or not");
            n=in.nextInt();
            for (i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    add=add+i;
                }
            }
            if(n==add)
            {
                System.out.println("The no is perfect");
            }
            else
            {
                System.out.println("Its not a perfect no");
            }
        }
    }
}