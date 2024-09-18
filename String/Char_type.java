package Str;

import java.util.Scanner;
class Char_type
{
    public static void main(String [] args)
    {
        char a;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a character");
        a=in.next().charAt(0);
        if(Character.isLetter(a)==true)
        {
            if(Character.isUpperCase(a)==true)
            System.out.println(a+" is a upper case character");
            else
            System.out.println(a+" is a lower case character");
        }
        else
        {
            if(Character.isDigit(a)==true)
            System.out.println(a+" is a digit");
            else
            System.out.println(a+ " is a special charecter");
        }
    }
}