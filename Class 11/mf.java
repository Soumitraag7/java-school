package if_else;
import java.util.Scanner;
class mf
{
    public static void main(String args[])
    {
        String a,m,f;
        double basic,hra,gs,ns,pf,epf,ags;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER YOUR NAME");
        a=in.nextLine();
        System.out.println("ENTER YOUR BASIC SALARY(in Rs)");
        basic=in.nextInt();
        hra=(basic*0.4);
        pf=(basic*0.12);
        epf=(basic*0.02);
        gs=basic+hra;
        System.out.println("YOUR GROSS SALARY (in Rs)="+gs);
        ns=gs-(pf+epf);
        System.out.println("YOUR NET SALARY   (in Rs)="+ns);
        ags=gs*12;
        System.out.println("YOUR ANUAL GROSS SALARY (in Rs)="+ags);
        System.out.println("ENTER m FOR MALE & f FOR FEMALE");
        m=in.nextLine();
        f=in.nextLine();
        if ((ags>150000 && m==m)|| (ags>200000 && f==f))
        {
            System.out.println("INCOME TAX PAYER");
        }
        else
        {
            System.out.println("NO INCOME TAX PAYER");
        }
    }
}