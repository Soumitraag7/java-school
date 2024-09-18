package bord_Q;

//Output:
/*
Enter the first number
54
Enter the second number
78
Original no. are 54 and 78
Merged no. is 5478

 */
import java.util.Scanner;
class merger
{
    long n1,n2,mergNum;
    merger()
    {
        n1=0;
        n2=0;
        mergNum=0;
    }
    void readNumber()
    {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the first number");
        n1=in.nextLong();
        System.out.println("Enter the second number");
        n2=in.nextLong();
    }
    void JoinNum()
    {
        int p=1;
        long t=n2;
        while(t>0)
        {
            p=p*10;
            t=t/10;
        }
        mergNum=n1*p+n2;
    }
    void show()
    {
        System.out.println("Original no. are "+n1+" and "+n2);
        System.out.println("Merged no. is "+mergNum);
    }
    public static void mian (String [] args)
    {
        merger ob=new merger();
        ob.readNumber();
        ob.JoinNum();
        ob.show();
    }
}