/*function overloading
 * 
 * output:
 * 
 * Enter
1. To check a Buzz Number
		or
2. To check if the Number is a composit number or not
1
Enter a no to check if the no is a Buzz no or not
2127
2127 Is a Buzz Number

Enter
1. To check a Buzz Number
		or
2. To check if the Number is a composit number or not
2
Enter a number to check weather the no is a composit number or not
123
123 Is a composit number

 * 
 */

import java.util.Scanner;
class check_num
{
    public void number(int a)
    {
        Scanner in=new Scanner(System.in);
        switch(a)
        {
            case 1:
            System.out.println("Enter a no to check if the no is a Buzz no or not");
            int l=in.nextInt();
            if(l/7==0 || l%10==7)
            {
                System.out.println(l+" Is a Buzz Number");
            }
            else
            {
                System.out.println("The number is not a Buzz Number");
            }
            break;
            case 2:
            System.out.println("Enter a number to check weather the no is a composit number or not");
            int l1=in.nextInt();
            int c=0;
            for(int i=2;i<l1;i++)
            {
                if(l1%i==0)
                c++;
            }
            if(c>1)
            System.out.println(l1+" Is a composit number");
            else
            System.out.println("The no is not a composit number");
            break;
            
            default:
            System.out.println("Wrong choice!");
        }
    }
    public static void main(String [] args)
    {
        int ch;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter\n1. To check a Buzz Number");
        System.out.println("\t\tor\n2. To check if the Number is a composit number or not");
        ch=in.nextInt();
        check_num ob=new check_num();
        ob.number(ch);
    }
}