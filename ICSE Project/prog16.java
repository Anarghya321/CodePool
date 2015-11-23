import java.util.*;
public class prog16
{
    public static void main(String args[])
    {
        int count,sum;
        Scanner sc =new Scanner(System.in);
        int a[]=new int[15];
        int x=a.length;
        System.out.println("Enter the no.s: ");
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++)
        {
            count=0;
            for(int j=1;j<=a[i];j++)
            {
                if(a[i]%j==0)
                {
                     count++;
                }
            }
            if(count==2)
            {
                     System.out.println("Prime: "+a[i]);
                    }
                }
        for(int i=0;i<x;i++)
        {
            sum=0;
            for(int j=1;j<a[i];j++)
            {
                if(a[i]%j==0)
                {
                    sum=sum+j;
                }
            }
            if(sum==a[i])
            {
                System.out.println("Perfect: "+a[i]);
            }
        }
    }
}

                    