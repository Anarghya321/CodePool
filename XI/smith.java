import java.util.*;
public class smith
{
    boolean prime(int no)
    {
        int c=0;
        for(int i=1;i<=no;i++)
        {
            if(no%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        smith obj=new smith();
        Scanner sc =new Scanner(System.in);
        int n,d,sum=0,sum1=0;
        System.out.println("Enter a no.");
        n=sc.nextInt();
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            sum=sum+d;
        }
        System.out.println(sum);
        for(int i=2;i<=n;i++)
        {
                while(n%i==0)
                {
                    sum1=sum1+i;
                    n=n/i;
                }
            }
        System.out.println(sum1);
    }
}

 
            

        