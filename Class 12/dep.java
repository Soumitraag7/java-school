import java.util.Scanner;
class dep
{
    public static void main(String[]args)
    {
        int sp,y;
        double rtd;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE SHOW ROOM PRICE");
        sp=in.nextInt();
        System.out.println("ENTER THE NO OF YEAR USED CAR YOU WANT TO BUY");
        y=in.nextInt();
        System.out.println("\nTHE SHOW ROOM PRICE: Rs"+sp);
        switch(y)
        {
            case 1:
            rtd=(sp*10)/100;
            System.out.println("THE DEPRECATED PRICE: Rs"+rtd);
            System.out.println("THE DEPRECATED PRICE YOU HAVE TO PAY: Rs"+(sp-rtd));
            break;
            case 2:
            rtd=(sp*20)/100;
            System.out.println("THE DEPRECATED PRICE: Rs"+rtd);
            System.out.println("THE DEPRECATED PRICE YOU HAVE TO PAY: Rs"+(sp-rtd));
            break;
            case 3:
            rtd=(sp*30)/100;
            System.out.println("THE DEPRECATED PRICE: Rs"+rtd);
            System.out.println("THE DEPRECATED PRICE YOU HAVE TO PAY: Rs"+(sp-rtd));
            break;
            case 4:
            rtd=(sp*50)/100;
            System.out.println("THE DEPRECATED PRICE: Rs"+rtd);
            System.out.println("THE DEPRECATED PRICE YOU HAVE TO PAY: Rs"+(sp-rtd));
            break;
            default:
            rtd=(sp*60)/100;
            System.out.println("THE DEPRECATED PRICE: Rs"+rtd);
            System.out.println("THE DEPRECATED PRICE YOU HAVE TO PAY: Rs"+(sp-rtd));
            break;
        }
    }
}