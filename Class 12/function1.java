import java.util.Scanner;
class function1
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS");
        a=in.nextInt();
        b=in.nextInt();
        function1 ob=new function1();
        c=ob.Add(a,b);
        System.out.println("c="+c);
    }
    public int Add(int m,int n)
    {
        int p=m+n;
        //System.out.println("p="+p);
        return(p);
    }
}

       
                                                                                                                                                                 
        