import java.util.Scanner;
class demopassbyreference
{
    int num1,num2;
    public static void main(String [] args)
    {
        int nm1=0,nm2=0;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter two no");
        nm1=in.nextInt();
        nm2=in.nextInt();
        
        demopassbyreference obj1=new demopassbyreference();
        
        obj1.num1=nm1;
        obj1.num2=nm2;
        
        System.out.println("\nOriginally obj1 data members are");
        System.out.println("num1 is "+obj1.num1+" and num2 is "+obj1.num2);
        System.out.println("Now invoking swap() method to swap the values of \nthese 2 data members of object abj1 by passin obj1");
        
        swap(obj1);
        System.out.println("Returned from swap() method");
        System.out.println("\tAfter swap method, num1 is "+obj1.num1+" and num2 is "+obj1.num2);
    }
    public static void swap(demopassbyreference obj2)
    {
        System.out.println("\nNow Control is inside the swap method");
        System.out.println("Value received in object obj2.\n The obj2 stores the reference of pass object obj1");
        System.out.println("obj2 data members are: num1 is "+obj2.num1+", num2 is "+obj2.num2);
        int temp=obj2.num1;
        obj2.num1=obj2.num2;
        obj2.num2=temp;
        System.out.println("\tAfter swaping inside swap()method, nnum1 is "+obj2.num1+", num2 is "+obj2.num2);
    }
}