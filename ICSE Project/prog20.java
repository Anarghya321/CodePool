import java.util.*;
public class prog20
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int l=0,u,p,flag=0;
        int a[]=new int[10];
        int x=a.length;
        u=x-1;
        System.out.println("Enter the elements:");
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the no. to be searched");
        int n=sc.nextInt();
        while(l<=u)
        {
            p=(l+u)/2;
            if(a[p]<n)
            {
                l=p+1;
            }
            if(a[p]>n)
            {
                u=p-1;
            }
            if(a[p]==n)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}

                