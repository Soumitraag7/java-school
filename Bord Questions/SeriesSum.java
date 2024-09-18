package bord_Q;


import java.util.Scanner;
class SeriesSum
{
    int x,n;
    double sum;
    SeriesSum(int xx,int nn)
    {
        x=xx;
        n=nn;
        sum=0.0;
    }
    double findfact(int m)
    {
        if (m==1)
        return 1;
        else
        return (m*findfact(m-1));
    }
    double findpower(int x,int y)
    {
        if(y==1)
        return x;
        else
        return (x*findpower(x,y-1));
    }
    void calculate()
    {
        for(int i=2;i<=n;i+=2)
        {
            sum+=findpower(x,i)/findfact(i-1);
        }
    }
    void display()
    {
        System.out.println("Sum is: "+sum);
    }
    public static void main(String [] args)
    {
        Scanner in=new Scanner (System.in);
        
        System.out.println("Enter the power");
        int p=in.nextInt();
        System.out.println("Enter the number");
        int nm=in.nextInt();
        
        SeriesSum ob=new SeriesSum(p,nm);
        
        ob.calculate();
        ob.display();
    }
}