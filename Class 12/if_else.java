import java.util.Scanner;
class if_else
{
    public static void main (String [] args)
    {
        int a;
        Scanner in=new Scanner (System.in);
        System.out.println("INPUT YOUR %AGE");
        a=in.nextInt();
        if (a>=0 && a<=39)
        {
            System.out.println("Failed");
        }
        else if (a>=40 && a<=59)
        {
            System.out.println("Satisfactory");
        }
        else if (a>=60 && a<=79)
        {
            System.out.println("Good");
        }
        else if (a>=80 && a<=100)
        {
            System.out.println("Exellente");
        }
        else if(a<=-1)
        {
            System.out.println("Wrong input");
        }
        else
        { System.out.println("Wrong input");}
    }
}