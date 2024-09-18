import java.util.Scanner;
class Number
{
    long number;
    Number(long n)
    {
        number=n;
    }
    boolean IsMerssene()
    {
        long n=0;
        for(int i=1;i<=20;i++)
        {
            n=(long)(Math.pow(2,i)-1);
            if(n==number)
            {
                return(true);
            }
        }
        return(false);
    }
    boolean IsDoubleMerssene()
    {
        long n=0,pow=0;
        for(int i=1;i<=20;i++)
        {
            pow=(long)(Math.pow(2,i)-1);
            n=(long)(Math.pow(2,pow)-1);
            if(n==number)
            {
                return(true);
            }
        }
        return(false);
    }
    void genMersseneNos()
    {
        long num=0;
        System.out.println("Generated Merssene number are:");
        for(int i=1;i<=10;i++)
        {
            num=(long)(Math.pow(2,i)-1);
            System.out.println(num+" ");
        }
    }
    void genMerssene()
    {
        long num=0,pow=0;
        System.out.println("Generated Merssene number are:");
        for(int i=1;i<=7;i++)
        {
            pow=(long)(Math.pow(2,i)-1);
            num=(long)(Math.pow(2,pow)-1);
            System.out.println(num+" ");
        }
    }
    public static void main (String [] args)
    {
        Scanner in=new Scanner(System.in);
        long n;
        System.out.println("Enter a number");
        n=in.nextInt();
        Number ob=new Number(n);
        if(ob.IsMerssene()==true)
        {
            System.out.println(n+" is a Merssene number");
            ob.genMersseneNos();
        }
        else if(ob.IsDoubleMerssene()==true)
        {
            System.out.println(n+" is a Double Merssene number");
            ob.genMerssene();
        }
        else
        {
            System.out.println(n+" is nerither a Merssene number nor a Double Merssene number");
        }
    }
}