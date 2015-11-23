import java.util.*;
public class prog4
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String a,b;
        System.out.println("Enter two strings");
        a=sc.next();
        b=sc.next();
        int compare=a.compareTo(b);
        if(compare < 0)
        {
            System.out.println("Alphabetical Order: "+a+","+b);
        }
        if(compare > 0)
        {
            System.out.println("Alphabetical Order: "+b+","+a);
        }
        else if(compare == 0)
        {
            System.out.println("Both are equal");
        }
    }
}
