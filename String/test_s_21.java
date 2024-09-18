package Str;

import java.util.Scanner;
class test_s_21
{
    public static void main(String [] args)
    {
        String a,b;
        Scanner in=new Scanner (System.in);
        a="COMPUTER IS FUN";
        b="FUN";
        System.out.println(a);
        System.out.println(b);
        boolean x=a.endsWith(b);
        System.out.println(x);
    }
}