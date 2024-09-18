
import java.util.Scanner;
class red
{
    public static void main (String args[])
    {
        int a,s,r,l,b,h,vcube,vsphere,vcuboid;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER 1 FOR FINDING THE VOLUME OF CUBE");
        System.out.println("ENTER 2 FOR FINDING THE VOLUME OF SPHERE");
        System.out.println("ENTER 3 FOR FINDING THE VOLUME OF CUBOID");
        a=in.nextInt();
        switch (a)
        {
            case 1: 
            System.out.println("ENTER THE VALUE FOR s=");
            s=in.nextInt();
            vcube=s*s*s;
            System.out.println("THE VOLUME OF CUBE= "+vcube);
            break;
            case 2: 
            System.out.println("ENTER THE VALUE OF r=");
            r=in.nextInt();
            vsphere=(4/3)*(22/7)*r*r*r;
            System.out.println("THE VOLUME OF SPHERE= "+vsphere);
            break;
            case 3: 
            System.out.println("ENTER THE VALUE OF l= ");
            l=in.nextInt();
            System.out.println("ENTER THE VALUE OF b= ");
            b=in.nextInt();
            System.out.println("ENTER THE VALUE OF h= ");
            h=in.nextInt();
            vcuboid=l*b*h;
            System.out.println("THE VOLUME OF CUBOID= "+vcuboid);
            break;
            default: System.out.println("SORRY WRONG INPUT");
        }
    }
}