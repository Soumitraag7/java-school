import java.util.Scanner;
class da
{
    public static void main (String args[])
    {
        double a,da,sa,gs;
        Scanner in=new Scanner (System.in);
        System.out.println("BASIC SALARY=");
        a=in.nextDouble();
        if (a<=10000)
        {
            System.out.println("BASIC           DA              SA              GS");
            da=a*0.1;
            sa=a*0.05;
            gs=a+da+sa;
            System.out.println(a+"\t\t" +da+ "\t\t" +sa+ "\t\t" +gs);
        }
        else if(a>=10001 && a<=20000)
        {
            System.out.println("BASIC           DA              SA              GS");
            da=a*0.12;
            sa=a*0.08;
            gs=a+da+sa;
            System.out.println(a+"\t\t" +da+ "\t\t" +sa+ "\t\t" +gs);
        }
       else if(a>=20001 && a<=30000)
       {
        System.out.println("BASIC           DA              SA              GS");
            da=a*0.15;
            sa=a*0.1;
            gs=a+da+sa;
            System.out.println(a+"\t\t" +da+ "\t\t" +sa+ "\t\t" +gs);
        }
        else
        {
            System.out.println("BASIC           DA              SA              GS");
            da=a*0.2;
            sa=a*0.12;
            gs=a+da+sa;
            System.out.println(a+"\t\t" +da+ "\t\t" +sa+ "\t\t" +gs);
        }
}
}