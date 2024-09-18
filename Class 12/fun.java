import java.util.Scanner;
class fun
{
    void greeting(String name, int age)
    {
        System.out.println("Hi!..."+name);
        if (age>=18)
        System.out.println("You are good to vote");
        else
        System.out.println("You are not good to vote");
    }
    public static void main()
    {
        String name;
        int age;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter your name");
        name=in.next();
        System.out.println("Enter your age");
        age=in.nextInt();
        fun obj=new fun();
        obj.greeting(name,age);
        System.out.println("The end");
    }
}