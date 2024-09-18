import java.util.Scanner;
class HR
{
    public static void main (String args [])
    {
        int a,b,c,d,e,f,g,h,add;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the valu of HR= ");
        a=in.nextInt();
        b=(10*a)/100;
        c=(3*a)/100;
        d=b+c;
        System.out.println("Your DA= "+b);
System.out.println("Your HR= "+c);
System.out.println("total= "+d);        
    }
}