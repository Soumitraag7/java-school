package bord_Q;


import java.util.Scanner;
class fiboSeries
{
    String x,y,z;
    int n;
    fiboSeries()
    {
        x="a";
        y="b";
        z="ba";
    }
    void accept()
    {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the no. terms");
        n=in.nextInt();
    }
    void generate()
    {
        System.out.println(x+" "+y+" ");
        for(int i=3;i<=n;i++)
        {
            z=y+x;
            x=y;
            y=z;
            System.out.print(z+",");
        }
        System.out.println("\n"+z);
    }
    public static void main(String [] args)
    {
        fiboSeries ob=new fiboSeries();
        ob.accept();
        ob.generate();
    }
}