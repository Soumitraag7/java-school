import java.util.Scanner;
class numbre
{
    public int gcd(int a1, int b1)
    {
        int gcd1=1,x;
        x=a1*b1;
        for ( int i=1;i<=x;i++)
        {
            if (a1%i==0 && b1%i==0)
            {
                gcd1=i;
            }
        }
        return(gcd1);
    }
    public int lcm(int a2, int b2)
    {
        int gcd2=1,lcm1=1,y;
        y=a2*b2;
        for ( int i=1;i<=y;i++)
        {
            if (a2%i==0 && b2%i==0)
            {
                gcd2=i;
            }
            lcm1=a2*b2/gcd2;
        }
        return(lcm1);
    }
    public void relation(int a3,int b3)
    {
        int l=lcm(a3,b3);
        int g=gcd(a3,b3);
        int prod_l_g=l*g;
        int prod_a3_b3=a3*b3;
        System.out.println("\nThe LCM of "+a3+" and "+b3+" is: "+l);
        System.out.println("The GCD of "+a3+" and "+b3+" is: "+g);
        System.out.println("The product of LCM and GCD of "+a3+" and "+b3+" is: "+prod_l_g);
        System.out.println("The product of "+a3+" and "+b3+" is: "+prod_a3_b3);
        System.out.println("It satisfies the eqn :LCM(a,b)*GCD(a,b)= a*b");
    }
    public static void main(String [] args)
    {
        Scanner in=new Scanner (System.in);
        int a,b;
        System.out.println("Enter two no");
        a=in.nextInt();
        b=in.nextInt();
        numbre ob=new numbre();
        ob.relation(a,b);
    }
}