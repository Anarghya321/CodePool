import java.util.*;
public class pronic
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n,flag=0;
        System.out.println("Enter a number");
        n=sc.nextInt();
        if(n==0)
        {
            System.out.println("Pronic");
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                if(i*(i+1)==n)
                {
                    flag=1;
                }
            }
            if(flag==1)
            {
                System.out.println("Pronic");
            }
            else
            {
                System.out.println("Not pronic");
            }
        }
    }
}