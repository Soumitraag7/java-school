package Str;

import java.util.Scanner;
class test_s_10
{
    public static void main(String [] args)
    {
        String a;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a character");
        a=in.nextLine();
        int c=a.indexOf('A',4);
        System.out.println(c);
    }
}