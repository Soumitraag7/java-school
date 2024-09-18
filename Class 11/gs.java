import java.util.Scanner;
class gs
{
    public static void main (String args[])
    {
    double basic,da,sa,gs;
    Scanner in=new Scanner (System.in);
    System.out.println("ENTER YOUR BASIC SALARY (in Rs)=");
    basic=in.nextDouble();
    if (basic<=10000)
    {
     da=(basic*0.1);
     sa=(basic*0.05);
     gs=basic+da+sa;
     System.out.println("BASIC            DA              SA                GS");
     System.out.println(basic+"\t\t"+da+"\t\t"+sa+"\t\t"+gs+"\t\t");
    }
    else if (basic>=10001 && basic<=20000)
    {
     da=(basic*0.12);
     sa=(basic*0.08);
     gs=basic+da+sa;
     System.out.println("BASIC            DA              SA                GS");
     System.out.println(basic+"\t\t"+da+"\t\t"+sa+"\t\t"+gs+"\t\t");
    }
    else if (basic>=20001 && basic<=30000)
    {
     da=(basic*0.15);
     sa=(basic*0.1);
     gs=basic+da+sa;
     System.out.println("BASIC            DA              SA                GS");
     System.out.println(basic+"\t\t"+da+"\t\t"+sa+"\t\t"+gs+"\t\t");
    }
    else
    {
     da=(basic*0.2);
     sa=(basic*0.12);
     gs=basic+da+sa;
     System.out.println("BASIC            DA              SA                GS");
     System.out.println(basic+"\t\t"+da+"\t\t"+sa+"\t\t"+gs+"\t\t");
    }
}
}