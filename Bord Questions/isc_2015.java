package Str.strbuffer;


import java.util.Scanner;
class isc_2015
{
    Scanner in=new Scanner (System.in);
    int Adno[]=new int[10];
    isc_2015()
    {
        
    }
    void fillArray()
    {
        System.out.println("Enter 10 numbers");
        for(int i=0;i<10;i++)
        Adno[i]=in.nextInt();
    }
    int binSearch(int l,int u,int v)
    {
        int m=(l+u)/2;
        if (Adno[m]==v)
        return 1;//return m;
        else if (l>u)
        return -1;
        else if(Adno[m]>v)
        return ( binSearch(l,m-1,v) );
        else
        return ( binSearch(m+1,u,v) );
    }
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        
        isc_2015 ob=new isc_2015();
        
        ob.fillArray();
        
        System.out.println("Enter the number to be searched");
        int sc=in.nextInt();
        
        int re=ob.binSearch(0,ob.Adno.length-1,sc);
        
        if (re==1)
        System.out.println(sc+" is  found");
        else
        System.out.println(sc+" is not found");
        
    }
}