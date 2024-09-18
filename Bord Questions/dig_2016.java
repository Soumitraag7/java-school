package bord_Q.practical;


import java.util.Scanner;
class dig_2016
{
    int A[][],B[],m,n;
    void input()
    {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the size of a squar matrix");
        m=in.nextInt();
        A = new int[m][m];
        n = (m-2)*(m-2);
        B = new int[n];
        if(m>3 || m>10)
        {
            System.out.println("Enter the elements of the matrix");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    A[i][j]=in.nextInt();
                }
            }
        }
        else
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
    }
    
    void convert(int s)
    {
        int x=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i != 0 && j != 0 && i != m-1 && j != m-1)
                {
                    if(s==1)
                        B[x] = A[i][j];
                    else
                        A[i][j] = B[x];
                    x++;
                }
            }
        }
    }
    
    void sortArray() 
    {
        int c = 0;
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(B[i]>B[j])
                {
                    c = B[i];
                    B[i] = B[j];
                    B[j] = c;
                }
            }
        }
    }
    
    void printArray() 
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    void printDiagonal() 
    {
        int sum = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j || (i+j)==m-1)
                {
                    System.out.print(A[i][j]+"\t");
                    sum = sum + A[i][j];
                }
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("Sum of the Diagonal Elements : "+sum);
    }
    
    public static void main(String args[])
    {
        dig_2016 ob = new dig_2016();
        ob.input();
        System.out.println("*********************");
        System.out.println("The original matrix:");
        System.out.println("*********************\n");
        ob.printArray(); 
        ob.convert(1); 
        ob.sortArray(); 
        ob.convert(2); 
 
        System.out.println("*********************");
        System.out.println("The Rearranged matrix:");
        System.out.println("*********************\n");
        ob.printArray(); 
        
        System.out.println("*********************");
        System.out.println("The Diagonal Elements:");
        System.out.println("*********************");
        ob.printDiagonal();
    }
}