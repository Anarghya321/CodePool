import java.util.*;
public class prog2
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        double i,t=0;
        System.out.println("Enter the annual income");
        i=sc.nextDouble();
        if(i<=100000)
        {
            t=0;
        }
        if((i>100000)&&(i<=150000))
        {
            t=0.1*(i-100000);
        }
        if((i>150000)&&(i<=200000))
        {
            t=5000+0.2*(i-150000);
        }
        if(i>200000)
        {
            t=15000+0.3*(i-200000);
        }
        System.out.println("Tax deducted: Rs "+t);
    }
}
