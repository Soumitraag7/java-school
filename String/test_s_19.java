package Str;

import java.util.Scanner;
class test_s_19
{
    public static void main(String [] args)
    {
        String a,b;
        Scanner in=new Scanner (System.in);
        a="COMPUTER";
        b="computer";
        System.out.println(a);
        System.out.println(b);
        int n=a.compareTo(b);
        if(n==0)
        System.out.println(n);
        else if(n>0)
        System.out.println("A is greater than B");
        else
        System.out.println("B is greater than A");
    }
}