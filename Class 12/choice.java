/*function overloading
 * 
 * output:
 * 
 * Enetr a cahracter
p
Enter three number
2 3 4
Enter two string
helo
helo
helo & helo are equal
The cube of the number is 8
The product of the number is 12

 * 
 */

import java.util.Scanner;
class choice
{
    public void num_cal(int num, char ch)
    {
        if(ch=='s')
        {
            System.out.println("The square of the number is "+(num*num));
        }
        else
        {
            System.out.println("The cube of the number is "+(num*num*num));
        }
    }
    public void num_cal(int a, int b, char ch)
    {
        if(ch=='p')
        {
            System.out.println("The product of the number is "+(a*b));
        }
        else
        {
            System.out.println("The sum of the number is "+(a+b));
        }
    }
    public void num_cal(String str1, String str2)
    {
        if(str1.equals(str2))
        {
            System.out.println(str1+" & "+str2+" are equal");
        }
        else
        {
            System.out.println("Two string are not equal");
        }
    }
    public static void main(String [] args)
    {
        String c1,c2;
        int a1,a2,a3;
        Scanner in=new Scanner (System.in);
        System.out.println("Enetr a cahracter");
        char c3=in.next().charAt(0);
        System.out.println("Enter three number");
        a1=in.nextInt();
        a2=in.nextInt();
        a3=in.nextInt();
        System.out.println("Enter two string");
        c1=in.next();
        c2=in.next();
        choice ob=new choice();
        ob.num_cal(c1,c2);
        ob.num_cal(a1,c3);
        ob.num_cal(a2,a3,c3);
    }
}