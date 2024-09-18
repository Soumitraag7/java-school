import java.util.*;
class array_matrix2
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int a[][]=new int [2][2];
        System.out.println ("Enter th values :");
        {
            for (int i=0;i<2;i++)
            {
                for (int j=0;j<2;j++)
                {
                    a[i][j]=in.nextInt();
                }
            }
        }
        System.out.println ("Before Transpose :");
        {
            for (int i=0;i<2;i++)
            {
                for (int j=0;j<2;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
        }
        for (int i=0;i<2;i++)
        {
            for (int j=i+1;j<2;j++)
            {
                int tem=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=tem;
            }
        }
        System.out.println ("After Transpose :");
        {
            for (int i=0;i<2;i++)
            {
                for (int j=0;j<2;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
}
            
        
    
        