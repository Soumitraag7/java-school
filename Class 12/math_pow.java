import java.util.*;
class math_pow
{
    public static void main (String [] args)
    {
        double a;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER A NO");
        a=in.nextDouble();
        if (a>=0 && a<10)
        System.out.println("THE NO IS A SINGLE DIGIT NO SO THE SQUARE OF THE NO YOU ENTERD WILL BE "+Math.pow(a,2));
        else if (a>=10 && a<100)
        System.out.println("THE NO IS A TWO DIGIT NO SO THE SQUARE ROOT OF THE NO YOU ENTERD WILL BE "+Math.sqrt(a));
        else if (a>=100 && a<=1000)
        System.out.println("THE NO IS A THREE DIGIT NO SO THE CUBE ROOT OF THE NO YOU ENTERD WILL BE "+Math.pow(a,1.0/3.0));
        else
        System.out.println("THE NO ENTERED IS MORE THAN THREE DIGIT");
    }
}