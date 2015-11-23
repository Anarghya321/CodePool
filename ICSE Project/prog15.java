import java.util.*;
public class prog15
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String n;
        int c=0;
        char ch;
        System.out.println("Enter a number");
        n=sc.next();
        int l=n.length();
        for(int i=0;i<l;i++)
        {
            ch=n.charAt(i);
            if(ch=='0')
            {
                c++;
            }
        }
            char f=n.charAt(0);
            if((c>0)&&(f!='0'))
            {
                System.out.println("It is a duck number");
            }
            else
            {
                System.out.println("It is not a duck number");
            }
        }
    }

