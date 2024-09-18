package bord_Q;


import java.util.Scanner;
class combine
{
    int com[],size;
    combine(int nn)
    {
        size=nn;
        com=new int [size];
    }
    void inputarray()
    {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter "+size+" elements of a array");
        for(int i=0;i<size;i++)
        {
            com[i]=in.nextInt();
        }
    }
    void sort()
    {
        int t;
        for(int i=0;i<size;i++)
        {
            for(int j=i;j<size;j++)
            {
                if (com[i]>com[j])
                {
                    t=com[i];
                    com[i]=com[j];
                    com[j]=t;
                }
            }
        }
    }
    void mix(combine A, combine B)
    {
        int i,j;
        for(i=0,j=0;i<A.size;i++,j++)
        {
            com[j]=A.com[i];
        }
        for(i=0;i<B.size;i++,j++)
        {
            com[j]=B.com[i];
        }
    }
    void display()
    {
        System.out.println("The mixed array is:");
        for(int i=0;i<size;i++)
        {
            System.out.print(com[i]+"\t");
        }
    }
    public static void main (String [] args) 
    {
        Scanner in=new Scanner (System.in);
        
        System.out.println("Enter the size of the first array");
        int a=in.nextInt();
        combine c1=new combine(a);
        c1.inputarray();
        
        System.out.println("Enter the size of the second array");
        int b=in.nextInt();
        combine c2=new combine(b);
        c2.inputarray();
        
        combine c3=new combine(a+b);
        c3.mix(c1,c2);
        c3.sort();
        c3.display();
    }
}