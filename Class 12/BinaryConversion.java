import java.util.Scanner;
public class BinaryConversion 
{
    public static void main(String [] args) 
    {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Please type a positive number < 128:");
       byte number = keyboard.nextByte();
       System.out.print(number + " decimal = ");
       // print out one digit after the other
       System.out.print(number/64);
       System.out.print((number%64)/32);
       System.out.print((number%32)/16);
       System.out.print((number%16)/8);
       System.out.print((number%8)/4);
       System.out.print((number%4)/2);
       System.out.print(number%2);
       System.out.println(" binary.");
    }
}