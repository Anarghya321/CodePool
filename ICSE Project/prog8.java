import java.util.*;
public class prog8
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        System.out.println("The prime factors of "+n+" are: ");
        int i=2;
        while(n>1)
        {
            if(n%i==0)
            {
                System.out.println(i);
                n=n/i;
            }
            else
            i++;
        }
    }
}
