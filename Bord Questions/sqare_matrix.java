package bord_Q;


import java.util.Scanner;
class sqare_matrix
{
    public static void main(String [] args)
    {
        int A[][];
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the number of element");
        int m=in.nextInt();
        A=new int [m][m];
        
        if(m>2 && m<10)
       {  
           System.out.println("Enter "+m*m+" elements:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            A[i][j]=in.nextInt();
        }
        System.out.println("The Original Matrix is : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
               System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        int flag = 0;
           for(int i=0;i<m;i++)
           {
               for(int j=0;j<m;j++)
               {
                   if(A[i][j] != A[j][i])
                   {
                       flag = 1; // Setting flag = 1 when elements do not match
                       break;
                    }
               }
           }
        
           if(flag == 1)
                System.out.println("\nThe given Matrix is Not Symmetric");
           else
                System.out.println("\nThe given Matrix is Symmetric");
             
                /* Finding sum of the diagonals */
                int ld = 0, rd = 0;
                for(int i=0;i<m;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        if(i == j) // Condition for the left diagonal
                        {
                            ld = ld + A[i][j];
                        }
                        if((i+j) == (m-1)) // Condition for the right diagonal
                        {
                            rd = rd + A[i][j];
                        }
                    }
                }
        
                System.out.println("The sum of the left diagonal = "+ld);
                System.out.println("The sum of the right diagonal = "+rd);
            }
        
       else
            System.out.println("The Matrix Size is Out Of Range");
    }
}