import java.util.*;
class fc
{
    public static void main (String [] args)
    {
        double t,c,f;char w;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE TEMPERATURE YOU WANT TO CONVERT");
        t=in.nextDouble();
        System.out.println("ENTER c FOR CONVIRTING CELSIUS TO FAHRENHEIT AND VICE VERSA");
        w=in.next().charAt(0);
        switch(w)
        {
            case 'c':
            c=((5.0/9.0)*(t-32.0));
            System.out.println("CONVIRTING FAHRENHEIT TO CELSIUS= "+c);
            break;
            case 'f':
            f=(1.8*t+32.0);
            System.out.println("CONVIRTING FAHRENHEIT TO CELSIUS= "+f);
            break;
            default:
            System.out.println("WRONG INPUT");
        }
    }
}
            