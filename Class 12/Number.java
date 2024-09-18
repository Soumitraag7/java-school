/* the longest program of all
 * output:
 * 
Enter a no
23
It is not a armgstrong no
Generated Armstrong number are as follows
153
370
371
407

Enter a no
1634
1634 is not Armgstrong Like Number
Generated Armstrong Like number are as follows
165033
221859
336700
336701
340067
341067
407000
407001
444664
487215
982827
983221

 */

import java.util.Scanner;
class Number
{
    long number;
    Number(long n)
    {
        number=n;
    }
    boolean IsArmgstrong()
    {
        long i;
        int sum=0;
        long no=number;
        while(no>0)
        {
            i=no%10;
            sum=sum+(int)(Math.pow(i,3));
            no=no/10;
        }
        if (number==sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean IsArmgstronglike()
    {
        long i;
        long sum=0;
        long n1=number;
        while(n1>0)
        {
            i=n1%100;
            sum=sum+(int)(Math.pow(i,3));
            n1=n1/100;
        }
        if (number==sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void genArmgstrongNos()
    {
        int sum=0,c;
        System.out.println("Generated Armstrong number are as follows");
        for(int i=100;i<1000;i++)
        {
            c=i;
             sum=0;
            while(c>0)
            {
            int j=c%10;
            sum=sum+(int)(Math.pow(j,3));
            c/=10;
            }
            if(i==sum)
            {
                System.out.println(sum);
            }
        }
    }
    void genArmgstrongLikeNos()
    {
        int sum=0,c;
        System.out.println("Generated Armstrong Like number are as follows");
        for(int i=100000;i<1000000;i++)
        {
             c=i;
             sum=0;
            while(c>0)
            {
            int j=c%100;
            sum=sum+(int)(Math.pow(j,3));
            c/=100;
            }
            if(i==sum)
            {
                System.out.println(sum);
            }
        }
    }
    public static void main (String [] args)
    {
        long a;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a no");
        a=in.nextLong();
        Number ob=new Number(a);
        if(ob.IsArmgstrong()==true)
        {
            System.out.println(a+" is a Armgstrong no");
        }
        else 
        {
            System.out.println("It is not a armgstrong no");
        }
        ob.genArmgstrongNos();
        System.out.println("\nEnter a no");
        a=in.nextLong();
        Number ob1=new Number(a);
        if(ob1.IsArmgstronglike()==true)
        {
            System.out.println(a+" is a Armgstrong Like Number");
        }
        else
        {
            System.out.println(a+" is not Armgstrong Like Number");
        }
        ob1.genArmgstrongLikeNos();
    }
}