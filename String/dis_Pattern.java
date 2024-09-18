package Str;


import java.util.Scanner;
class dis_Pattern
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner (System.in);
        String a;
        System.out.println("Enter a word to print the patern");
        a=in.next();
        int b=a.length();
        System.out.println("The patter is:");
        for(int c=0;c<b;c++)
        {
            System.out.println(a.charAt(c));
        }
    }
}