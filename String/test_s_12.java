package Str;

import java.util.Scanner;
class test_s_12
{
    public static void main(String [] args)
    {
        String a;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a character");
        a=in.nextLine();
        String c=a.substring(3);
        System.out.println(c);
    }
}