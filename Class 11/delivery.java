package if_else;
import java.util.Scanner;
class delivery
{
    public static void main (String args[])
    {
        double wet,x;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER 1 FOR KOLKATA");
        System.out.println("ENTER 2 FOR MUMBAI");
        System.out.println("ENTER 3 FOR CHENNAI");
        System.out.println("ENTER 4 FOR DELHI");
        x=in.nextDouble();
        System.out.println("ENTER THE WEIGHT OF THE PARCEL(in Kg)");
        wet=in.nextInt();
        if (x==1)
        {
            if (wet<=100)
            
                System.out.println("YOU HAVE TO PAY Rs45/Kg");
            
            else if(wet>100)
            
                System.out.println("YOU HAVE TO PAY Rs75/Kg");
        }
        else if (x==2)
        {
            if (wet<=100)
            
                System.out.println("YOU HAVE TO PAY Rs65/Kg");
            
            else if(wet>100)
            
                System.out.println("YOU HAVE TO PAY Rs95/Kg");
        }
        else if (x==3)
        {
            if (wet<=100)
            
                System.out.println("YOU HAVE TO PAY Rs75/Kg");
            
            else if(wet>100)
            
                System.out.println("YOU HAVE TO PAY Rs115/Kg");
        }
        else if (x==4)
        {
            if (wet<=100)
            
                System.out.println("YOU HAVE TO PAY Rs90/Kg");
            
            else if(wet>100)
            
                System.out.println("YOU HAVE TO PAY Rs125/Kg");
        }
        else
        {
            System.out.println("wrong input");
        }
    }
}