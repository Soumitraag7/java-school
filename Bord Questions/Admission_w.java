package bord_Q;

// using linear search
import java.util.Scanner;
class Admission_w
{
    int Adno[];
    Admission_w()
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
    int binSearch(int l)
    {
        int a=0;
        for(int i=0;i<10;i++)
        {
            if (Adno[i]==l)
            {
               ++a;
            }
            else
            --a;
        }
        return a;
    }
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        Admission_w ob=new Admission_w();
        ob.fillArray();
        System.out.println("Enter a number to be searched from the number's that you entered");
        int sc=in.nextInt();
        int re=ob.binSearch(sc);
        if(re==1)
        System.out.println(sc+" is found");
        else
        System.out.println(sc+" is not found");
    }
}