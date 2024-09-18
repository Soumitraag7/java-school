package Str;

import java.util.Scanner;
class test_s_22
{
    public static void main(String [] args)
    {
        String a,b;
        Scanner in=new Scanner (System.in);
        a="COMPUTER IS FUN";
        b="COMPUTER";
        System.out.println(a);
        System.out.println(b);
        boolean x=a.startsWith(b);
        System.out.println(x);
    }
}