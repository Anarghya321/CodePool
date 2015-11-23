import java.util.*;
public class prog14
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        int m=0,n=0;
    for(int i=1;i<=a+b;i++)
        {
            if(a%i==0)
            {
                m=m+1;
            }
            if(b%i==0)
            {
                n=n+1;
            }
        }
        if((m==2)&&(n==2))
        {
            if(((a-b)==2)||(b-a)==2)
            {
                System.out.println("They are twin prime");
            }
        else
        {
            System.out.println("They are not twin prime");
        }
    }
}
}