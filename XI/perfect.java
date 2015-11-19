import java.util.*;
public class perfect
{
    int n;
    perfect()
    {
        n=0;
    }
    perfect(int m)
    {
        m=n;
    }
    void perfect_sq(int n)
    {
        int count=0;
        for(int i=n;i>=n;i++)
        {
            int num=i;
            int sqrt=(int)Math.sqrt(num);
            if(sqrt*sqrt==num)
            {
                System.out.println(num+" is a perfect square");
                count++;
            }
            if(count==5)
            {
                break;
            }
        }
    }
    void sum_of(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            sum=i;
            int j=i+1;
            while(sum<n)
            {
                sum=sum+j;
                j++;
            }
            if(sum==n)
            {
                for(int k=i;k<j;k++)
                {
                    if(k==i)
                    System.out.print(k);
                    else
                    System.out.print(" "+k);
                }
                System.out.println();
            }
        }
    }
    void main()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        perfect obj=new perfect(number);
        System.out.println("The sum: ");
        obj.sum_of(number);
        System.out.println("The perfect squares: ");
        obj.perfect_sq(number);
    }
}