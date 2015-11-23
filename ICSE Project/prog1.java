import java.util.*;
public class prog1
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int d;
        double f=0;
        System.out.println("Enter the number of days late");
        d=sc.nextInt();
        if(d<=5)
        {
            f=0.40*d;
        }
        if((d>5)&&(d<=10))
        {
            f=0.65*d;
        }
        if(d>10)
        {
            f=0.80*d;
        }
        System.out.println("Fine: Rs "+f);
    }
}
