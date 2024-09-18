package if_else;
import java.util.Scanner;
class railway_fair
{
    public static void main (String args[])
    {
        double age,dis;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER YOUR AGE");
        age=in.nextDouble();
        System.out.println("ENTER THE DISTANCE TRAVELED(in Km)");
        dis=in.nextInt();
        if (age<10)
        {
            if (dis<10)
            
                System.out.println("YOU HAVE TO PAY Rs5");
            
            else if(dis>=10 && dis<50)
            
                System.out.println("YOU HAVE TO PAY Rs20");
            else if(dis>=50)
            
                System.out.println("YOU HAVE TO PAY Rs50");
        }
        else if (age>=10 && age<60)
        {
            if (dis<10)
            
                System.out.println("YOU HAVE TO PAY Rs10");
            
            else if(dis>=10 && dis<50)
            
                System.out.println("YOU HAVE TO PAY Rs40");
            else if(dis>=50)
            
                System.out.println("YOU HAVE TO PAY Rs80");
        }
        else if (age>=60)
        {
            if (dis<10)
            
                System.out.println("YOU HAVE TO PAY Rs4");
            
            else if(dis>=10 && dis<50)
            
                System.out.println("YOU HAVE TO PAY Rs15");
            else if(dis>=50)
            
                System.out.println("YOU HAVE TO PAY Rs35");
        }
    }
}