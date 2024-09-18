
import java.util.Scanner;
class day
{
    public static void main (String args[])
    {
        int a;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER THE NUMBER OF A DAY");
        a=in.nextInt();
        switch (a)
        {
            case 1: System.out.println("IT'S MONDAY");
            break;
            case 2: System.out.println("IT'S TUESDAY");
            break;
            case 3: System.out.println("IT'S WEDNESDAY");
            break;
            case 4: System.out.println("IT'S THURSDAY");
            break;
            case 5: System.out.println("IT'S FRIDAY");
            break;
            case 6: System.out.println("IT'S SATURDAY");
            break;
            case 7: System.out.println("IT'S SUNDAY");
            break;
            default: System.out.println("SORRY WRONG INPUT");
        }
    }
}