package bord_Q;


import java.util.Scanner;
class mixer
{
    int arr[],n;
    
    mixer(int nn)
    {
        n=nn;
        arr=new int[n];
    }
    
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the elements of the array in assanding order with out any duplicates");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
    }
    
    mixer mix(mixer A)
    {
        int i,j,t;
        mixer M=new mixer(n+A.n);
        for (i=0;i<n;i++)
        {
            M.arr[i]=arr[i];
        }
        for(i=0,j=n ; i<A.n ; i++,j++)
        {
            M.arr[j]=A.arr[i];
        }
        for(i=0;i<M.n;i++)
        {
            for(j=0;j<M.n;j++)
            {
                if(M.arr[i]>M.arr[j])
                {
                    t=M.arr[i];
                    M.arr[i]=M.arr[j];
                    M.arr[j]=t;
                }
            }
        }
        return (M);
    }
    
    void display()
    {
        System.out.println("The shorted number are");
        
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);
    }
    
    
    public static void main(String [] args)
    {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the number's you want to enter");
        int n=in.nextInt();
        
        mixer X=new mixer(n);
        mixer Y=new mixer(n);
        mixer Z=new mixer(n+n);
        
        X.accept();
        Y.accept();
        
        Z=X.mix(Y);
        Z.display();
    }
}