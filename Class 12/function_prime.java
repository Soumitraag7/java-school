import java.util.Scanner;
class function_prime
{
    public static void main(String args[])
    {
    int i;
    Scanner in=new Scanner(System.in);
    System.out.println("ENTER A NUMBER");
    i=in.nextInt();
    function_prime ob=new function_prime();
    int p=ob.check(i);
    if(p==1)
    {
        System.out.println("it is a prime number");
    }
    else
    {
        System.out.println("it is not a prime number");
    }
}
public int check(int n)
{
    int flag=0;
    for(int j=1;j<=n;j++)
    {
        if(n%j==0)
        {
            flag++;
        }
    }
    if(flag==2)
    {
        return(1);
    }
    else
    {
        return(0);
    }
}
}