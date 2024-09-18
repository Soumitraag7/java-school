package Str;

import java.util.Scanner;
class test_s_4
{
    public static void main(String [] args)
    {
        char a;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a character");
        a=in.next().charAt(0);
        boolean c=Character.isUpperCase(a);
        System.out.println(c);
    }
}