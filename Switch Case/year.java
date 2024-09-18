
import java.util.Scanner;
class year
{
    public static void main (String args[])
    {
        int a;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER THE NUMBER OF A MONTH");
        a=in.nextInt();
        switch (a)
        {
            case 1: System.out.println("IT'S JANUARY");
            break;
            case 2: System.out.println("IT'S FEBURARY");
            break;
            case 3: System.out.println("IT'S MARCH");
            break;
            case 4: System.out.println("IT'S APRIL");
            break;
            case 5: System.out.println("IT'S MAY");
            break;
            case 6: System.out.println("IT'S JUN");
            break;
            case 7: System.out.println("IT'S JULY");
            break;
            case 8: System.out.println("IT'S AUGUST");
            break;
            case 9: System.out.println("IT'S SEPTEMBR");
            break;
            case 10: System.out.println("IT'S OCTOBER");
            break;
            case 11: System.out.println("IT'S NOVEMBOR");
            break;
            case 12: System.out.println("IT'S DICEMBER");
            break;
            default: System.out.println("SORRY WRONG INPUT");
        }
    }
}