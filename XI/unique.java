import java.util.*;
public class unique
{
    boolean unique(int n)
    {
        int d,c=0,flag=0;
        int temp=n;
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            c++;
        }
        int a[]=new int[c];
        int i=0;
        while(temp!=0)
        {
            d=temp%10;
            a[i++]=d;
            temp=temp/10;
        }
        for(i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void main(String args[])
    {
        unique obj=new unique();
        Scanner sc =new Scanner(System.in);
        int m,n;
        System.out.println("Enter the starting and ending limit");
        m=sc.nextInt();
        n=sc.nextInt();
        int count=0;
        if((m<30000&&n<30000)&&(m<n))
        {
            for(int i=m;i<=n;i++)
            {
                if(obj.unique(i)==true)
                {
                    count++;
                }
            }
            System.out.println("the no. of unique numbers are: "+count);
            int arr[]=new int[count];
            int j=0;
            for(int i=m;i<=n;i++)
            {
                if(obj.unique(i)==true)
                {
                    arr[j++]=i;
                }
            }
            System.out.println("The unique nos. are: ");
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        else
        {
            System.out.println("Range not valid");
        }
    }
}

        
            