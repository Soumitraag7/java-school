package Recursive;
import java.util.Scanner;
class dec_2_bin
{
    long bin(long n)
    {
        if (n==0)
        {
            return 0;
        }
        else
        {
            return bin(n/2)*10+(n%2);
        }
    }
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a decimal number to convert the number to binary");
        long a=in.nextLong();
        
        dec_2_bin ob=new dec_2_bin();
        long c=ob.bin(a);
        System.out.println("The binery equivalent of "+a+" is "+c);
    }
}