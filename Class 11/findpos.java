import java.util.*;
class findpos
 {
    public static void main(String [] args)
    {
    int a,b,c;
    Scanner in=new Scanner (System.in);
    System.out.println("ENTER THREEE NO TO FIND IF ALL THE NO IS POSITIVE OR NEGATIVE OR IT'S A MIXER OF ALL");
    System.out.println("ENTER YOUR 1ST NO");
    a=in.nextInt();
    System.out.println("ENTER YOUR 2ND NO");
    b=in.nextInt();
    System.out.println("ENTER YOUR 3RD NO");
    c=in.nextInt();
    if (a>=0 && b>=0 && c>=0)
    System.out.println("ALL POSITIVE");
    else if (a<=0 && b<=0 && c<=0)
    System.out.println("ALL NEGATIVE");
    else
    System.out.println("THE COMBINATION OF BOTH");
   }
}