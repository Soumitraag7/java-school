package if_else;
import java.util.Scanner;
class shusha
{
    public static void main (String args[])
    {
        String a;
        double tamt,dis,namt;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER YOUR NAME");
        a=in.nextLine();
        System.out.println("ENTER YOUR TICKET AMOUNT(in Rs)=");
        tamt=in.nextInt();
        if (tamt>=70000)
        {
            System.out.println("NAME            TICKET AMT.             DISCOUNT %              NET AMT.");
            dis=(tamt*0.18);
            namt=tamt-dis;
            System.out.println(a+"\t\t"+tamt+"\t\t\t"+dis+"\t\t"+namt);
        }
        else if(tamt>=55001 && tamt<69999)
        {
            System.out.println("NAME            TICKET AMT.             DISCOUNT %              NET AMT.");
            dis=(tamt*0.16);
            namt=tamt-dis;
            System.out.println(a+"\t\t"+tamt+"\t\t\t"+dis+"\t\t"+namt);
        }
        else if (tamt>=35001 && tamt<55001)
        {
            System.out.println("NAME            TICKET AMT.             DISCOUNT %              NET AMT.");
            dis=(tamt*0.12);
            namt=tamt-dis;
            System.out.println(a+"\t\t"+tamt+"\t\t\t"+dis+"\t\t"+namt);
        }
        else if (tamt>=25001 && tamt<35001)
        {
            System.out.println("NAME            TICKET AMT.             DISCOUNT %              NET AMT.");
            dis=(tamt*0.1);
            namt=tamt-dis;
            System.out.println(a+"\t\t"+tamt+"\t\t\t"+dis+"\t\t"+namt);
        }
        else
        {
            System.out.println("NAME            TICKET AMT.             DISCOUNT %              NET AMT.");
            dis=(tamt*0.02);
            namt=tamt-dis;
            System.out.println(a+"\t\t"+tamt+"\t\t\t"+dis+"\t\t"+namt);
        }
    }
}