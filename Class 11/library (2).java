package if_else;
import java.util.Scanner;
class library
{
    public static void main (String args[])
    {
        String na,bn;
        int day,fine;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME");
        na=in.nextLine();
        System.out.println("ENTER THE BOOK NAME");
        bn=in.nextLine();
        System.out.println("ENTER THE NO OF DAYS OF LATE SUBMITION OF THE BOOK");
        day=in.nextInt();
        if (day<10)
        {
            fine=day*1;
            System.out.println("YOUR FINE FOR "+day+" IS Rs"+fine);
        }
        else if (day>=10 && day<20)
        {
            fine=day*5;
            System.out.println("YOUR FINE FOR "+day+" IS Rs"+fine);
        }
        else if (day>=20)
        {
            fine=day*8;
            System.out.println("YOUR FINE FOR "+day+" IS Rs"+fine);
        }
    }
}