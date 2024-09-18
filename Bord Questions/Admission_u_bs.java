package bord_Q;

// using binary search
import java.util.Scanner;
class Admission_u_bs
{
    int Adno[];
    Admission_u_bs()
    {
        Adno = new int[10];
    }
    void fillArray()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 10 number's");
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the "+(i+1)+"'s no.");
            Adno[i]=in.nextInt();
        }
    }
    int binSearch(int l,int u,int v)
    {
        if (l>u)
        return -1;
        
        else
        {
            int mid=(l+u)/2;
            if(v>Adno[mid])
            {
                return (binSearch(mid+l,u,v));
            }
            else if (v<Adno[mid])
            {
                return (binSearch(l,mid-1,v));
            }
            else
            {
                return 1;
            }
        }
    }
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        Admission_u_bs ob=new Admission_u_bs();
        ob.fillArray();
        System.out.println("Enter a number to be searched from the number's that you entered");
        int sc=in.nextInt();
        int re=ob.binSearch(0,9,sc);
        if(re==1)
        System.out.println(sc+" is found");
        else
        System.out.println(sc+" not found");
    }
}