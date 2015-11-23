import java.util.*;
public class prog12
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        double c,t,dp=0;
        System.out.println("Enter the original cost");
        c=sc.nextDouble();
        System.out.println("Enter the number of years used");
        t=sc.nextDouble();
        if(t==1)
        {
            dp=c*(1-0.1);
        }
        if(t==2)
        {
            dp=c*Math.pow(1-0.2,2);
        }
        if(t==3)
        {
            dp=c*Math.pow(1-0.3,3);
        }
        if(t==4)
        {
            dp=c*Math.pow(1-0.5,4);
        }
        if(t>4)
        {
            dp=c*Math.pow(1-0.6,t);
        }
        System.out.println("The depreciated value of the item: Rs "+dp);
    }
}

            