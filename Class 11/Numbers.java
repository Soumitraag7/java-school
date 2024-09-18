import java.util.Scanner;
class Numbers
{
    int n;
    void getnum()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("To check if the no is a triangular number\nEnter a no :");
        n=in.nextInt();
    }
    int check(int num)
    {
        int sum=0;
        for (int i=1;i<=num/2;i++)
        {
            sum+=i;
            if(sum==num)
            {
                break;
            }
        }
        if(sum==num && sum!=1)
        {
            return (1);
        }
        else
        {
            return (0);
        }
    }
    void displaysum()
    {
        if(check(n)==1)
        {
            System.out.println(n+" is a triangular number");
        }
        else
        {
            System.out.println(n+" is not a triangular number");
        }
    }
    public static void man(String [] args)
    {
        Numbers ob=new Numbers();
        ob.getnum();
        ob.displaysum();
    }
}