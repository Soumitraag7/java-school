package Str;

import java.util.Scanner;
class test_s_18
{
    public static void main(String [] args)
    {
        String a,b;
        Scanner in=new Scanner (System.in);
        a="COMPUTER";
        b="computer";
        System.out.println(a);
        System.out.println(b);
        if(a.equalsIgnoreCase(b))
        System.out.println("\nSame");
        else
        System.out.println("Different");
    }
}