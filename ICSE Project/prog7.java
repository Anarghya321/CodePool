import java.util.*;
public class prog7
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int f,l,s,p,n;
        System.out.println("Enter a two digit number");
        n=sc.nextInt();
        if((n>=10)&&(n<100))
        {
            f=n/10;
            l=n%10;
            s=f+l;
            p=f*l;
            if((s+p)==n)
            {
                System.out.println("It is a special two digit number");
            }
            else
            {
                System.out.println("It is not a special two digit number");
            }
        }
        else
        {
            System.out.println("Sorry,You have to enter a two digit number");
        }
    }
}

        