import java.util.Scanner;
class magic
{
    int n;
    magic()
    {
        n=0;
    }
    void getnum(int nn)
    {
        n=nn;
    }
    int sum_of_digit(int num)
    {
        int sum=0;
        int x=0;
        while(num>0)
        {
            x=num%10;
            sum+=x;
            num=num/10;
        }
        return(sum);
    }
    void ismagic()
    {
        int k=sum_of_digit(n);
        while(k>9)
        {
            int num=k;
            k=sum_of_digit(num);
        }
        if(k==1)
        {
            System.out.println(n+" is a magic no");
        }
        else
        {
            System.out.println(n+" is not a magic no");
        }
    }
    public static void main(String args[])
    {
        int n1;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the no you want to check");
        n1=in.nextInt();
        magic ob=new magic();
        ob.getnum(n1);
        ob.ismagic();
    }
}