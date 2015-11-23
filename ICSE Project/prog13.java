import java.util.*;
public class prog13
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String n;
        int flag=0;
        System.out.println("Enter a number");
        n=sc.next();
        int l=n.length();
        for(int i=0;i<l-1;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(n.charAt(i)==n.charAt(j))
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("It is a unique number");
        }
        else
        {
            System.out.println("It is not a unique number");
        }
    }
}
