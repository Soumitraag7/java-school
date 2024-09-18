import java.util.*;
class function_cube
{
    public double cube(double a)
    {
        double n;
        n=Math.pow(a,3.0);
        return(n);
    }
    public static void main()
    {
        int n;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ;
        Scanner in=new Scanner(System.in);
        function_cube ob=new function_cube();
        for(int i=1;i<11;i++)
        {
        System.out.println("ENTER A NUMBER");
        n=in.nextInt();
        double p=ob.cube(n);
        System.out.println((int)p);
    }
    }
}
    