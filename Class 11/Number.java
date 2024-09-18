import java.util.*;
class Number
{
    public int gcd (int a1,int b1)
    {
        int gcd1=1,x;
        x=a1*b1;
        for(int i=1;i<=x;i++)
        {
            if(a1%i==0 && b1%i==0)
            {
                gcd1=i;
            }
        }
        return(gcd1);
    }
    public int lcm(int a2,int b2)
    {
        int lcm=1,gcd=1,y;
        y=a2*b2;
        for(int i=1;i<=y;i++)
        {
            if(a2%i==0 && b2%i==0)
            {
                gcd=i;
            }
            lcm=a2*b2/gcd;
        }
        return(lcm);
    }
    public void Relation(int a3,int b3)
    {
        int l=lcm(a3,b3);
        int g=gcd(a3,b3);
        int prod_l_g=l*g;
        int prod=a3*b3;
        System.out.println("the lcm of"+a3+"and b"+b3+"is"+l);
        System.out.println("the gcd of"+a3+"and b"+b3+"is"+g);
        System.out.println("the product of lcm and gcd of"+a3+"and b"+b3+"is"+prod_l_g);
        System.out.println("the product of"+a3+"and b"+b3+"is"+prod);
        System.out.println("it satisfies the equation;lcm(a3,b3)*g(a3,b3)=ab");
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n1,n2;
        System.out.println("enter two numbers");
        n1=in.nextInt();
        n2=in.nextInt();
        Number obj1=new Number();
        obj1.Relation(n1,n2);
    }
}
        
        
        
        
        