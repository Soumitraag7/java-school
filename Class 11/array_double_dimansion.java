import java.util.*;
class array_double_dimansion
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the vaule :");
        int a[][]=new int[2][2];
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                System.out.println (a[i][j]);
            }  
        }
    }
}
   