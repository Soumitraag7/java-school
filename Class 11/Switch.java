//programe to add, subtruct, multiply and divide using switch case
import java.util.*;
class Switch
{
    public static void main(String args [])
    {
        Scanner in=new Scanner(System.in);
        int a=12,b=10;
        System.out.println("Enter the choice");
        System.out.println("1 for addition");
        System.out.println("2 for subtraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");
        int n=in.nextInt ();
        switch (n)
        {
            case 1 :System.out.print(a+b);
                  
                    break;
            case 2 :System.out.print(a-b);
                    
                    break;
            case 3 :System.out.print(a*b);
                    
                    break;
            case 4 :System.out.print(a/b);
                    
                    break;
            default:System.out.println ("Invalid Entry");
        }
    }
}