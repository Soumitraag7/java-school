import java.util.Scanner;
class m_or_f
{
    public static void main (String args[])
    {
        String a,b;
        int bs,hrpr,hr,pfpr,pf,epfpr,epf,ags,gs,ns;
        Scanner in=new Scanner (System.in);
        System.out.println("EMPLOYEE NUMBER");
        a=in.nextLine();
        System.out.println("EMPLYEE NAME");
        b=in.nextLine();
        System.out.println("BASIC SALA");
        bs=in.nextInt();
        hrpr=(40*bs)/100;
        hr=bs-hrpr;
        pfpr=(bs*12)/100;
        pf=bs-pfpr;
        epfpr=(bs*2)/100;
        epf=bs-epfpr;
        gs=bs-hr;
        ns=gs-(pf+epf);
        ags=gs*12;
        if (ags<=150000)
        {
           System.out.println("YOU HAVE TO PAY INCOME TAX");
        }
    }
}