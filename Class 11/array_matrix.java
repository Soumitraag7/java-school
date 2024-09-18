import java.util.*;
class array_matrix
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the vaule :");
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c=0;
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter the vaule :");
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                b[i][j]=in.nextInt();
            }  
        }
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                c=a[i][j]+b[i][j];
                System.out.println("The vaule is :"+c);
            }
        }
    }
}
   