import java.util.*;
class function_value
{
    public static void main(String args[])
    {
        int num1=0,num2=0;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER TYWO NUMBERS");
        num1=in.nextInt();
        num2=in.nextInt();
        System.out.println("\t originally,num1 is"+num1+"and num2 is"+num2);
        swap(num1,num2);
        System.out.println("\t after swap main function,num1 is"+num1+"and num2 is"+num2);
    }
    public static void swap(int n1,int n2)
    {
        System.out.println("values received in parameters n1 and n2");
        System.out.println("values received"+"n1"+"n2");
        int temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("\t after swap swapfunctionm,n1 is"+n1+"and n2 is"+n2);
    }
}
        