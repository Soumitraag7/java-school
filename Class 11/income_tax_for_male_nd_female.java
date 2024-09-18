import java.util.Scanner;
class income_tax_for_male_nd_female
{
    public static void main (String args[])
    {
        String b,f,m,fw;
        double a,bs,hrpr,hr,pfpr,pf,epfpr,epf,ags,gs,ns,ans;
        Scanner in=new Scanner (System.in);
        System.out.println("EMPLOYEE NUMBER");
        a=in.nextInt();
        System.out.println("BASIC SALA");
        bs=in.nextDouble();
        hr=bs*0.4;
        pf=bs*0.12;
        epf=bs*0.02;
        gs=bs+hr+pf;
        ns=gs-(epf+pf);
        ans= ns*12;
        System.out.println("your net salary"+ns);
        System.out.println("your Annual net salary"+ans);
        System.out.println("ENTER m FOR MALE and fw FOR FEMALE");
        m=in.nextLine();
        fw=in.nextLine();
        if((ans>150000 && m==m)||(ans>200000 && fw==fw))
        {
         System.out.println("income tax payer");   
        }
        else
        {
         System.out.println("not income tax payer");  
        }
    }
}