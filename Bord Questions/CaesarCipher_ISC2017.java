package bord_Q.practical;


/**
 * The class CaesarCipher_ISC2017 inputs a sentence and encrypts it by shifting
 * every alphabet 13 places ahead in a circular fashion
 * @author : www.guideforschool.com
 * @Program Type : BlueJ Program - Java
 * @Question Year : ISC Practical 2017 Question 3
 */
import java.util.*;
class CaesarCipher_ISC2017
{
    void rot13(String w)
    {
        char ch;
        int a = 0;
        String ans = "";
        for(int i = 0; i<w.length(); i++)
        {
            ch = w.charAt(i);
            if(Character.isLetter(ch))
            {
                a = ch + 13;
                 
                if((Character.isUpperCase(ch) && a>90) || (Character.isLowerCase(ch) && a>122))
                {
                    a = a - 26;
                }
                ch = (char)a;
            }
            ans = ans + ch;
        }
        System.out.println("OUTPUT : The cipher text is :\n"+ans);
    }
     
    public static void main(String args[])
    {
        CaesarCipher_ISC2017 ob = new CaesarCipher_ISC2017();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String s = sc.nextLine();
        int L = s.length();
        if(L<4 || L>99)
        {
            System.out.println("INVALID LENGTH");
        }
        else
        {
            ob.rot13(s);
        }
    }
}