package bord_Q;

//Output:
/*
Enter 9 elements of the array
2 4 6 8 10 1 3 5 7
---------------------------------------------------------
The matrix is:
2	4	6	
8	10	1	
3	5	7	
---------------------------------------------------------
The matrix after shifting is:
8	10	1	
3	5	7	
2	4	6	

 */
import java.util.Scanner;
class shift
{
    int mat[][];
    int m,n;
    shift(int mm, int nn)
    {
        m=mm;
        n=nn;
        mat=new int[m][n];
    }
    void input()
    {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter "+(3*3)+" elements of the array");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                mat[i][j]=in.nextInt();
            }
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("The matrix is:");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------");
    }
    void cyclic(shift P)
    {
        int j;
        for (int i=1;i<m;i++)
        {
            for (j=0;j<n;j++)
            {
                mat[i-1][j]=P.mat[i][j];
            }
        }
        for(j=0;j<n;j++)
        {
            mat[m-1][j]=P.mat[0][j];
        }
    }
    void display()
    {
        System.out.println("The matrix after shifting is:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String [] args)
    {
        shift A=new shift(3,3);
        shift B=new shift(3,3);
        A.input();
        B.cyclic(A);
        B.display();
    }
}