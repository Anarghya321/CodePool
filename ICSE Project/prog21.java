import java.util.*;
public class prog21
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a[]=new int[10];
        int x=a.length;
        System.out.println("Enter the elements:");
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<x-1;i++)
        {
            int t=0;
            for(int j=0;j<(x-i-1);j++)
            {
                if(a[j]<a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("The numbers arranged in descending order are: ");
        for(int i=0;i<x;i++)
        {
            System.out.println(a[i]);
        }
    }
}
