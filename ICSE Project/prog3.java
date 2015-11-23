import java.util.*;
public class prog3
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int c;
        double rate=0;
        System.out.println("Enter the amount of water consumed(in gallons)");
        c=sc.nextInt();
        if((c>45)&&(c<=75))
        {
            rate=475*c;
        }
        if((c>75)&&(c<=125))
        {
            rate=750*c;
        }
        if((c>125)&&(c<=200))
        {
            rate=1225*c;
        }
        if((c>200)&&(c<=350))
        {
            rate=1650*c;
        }
        if(c>350)
        {
            rate=2000*c;
        }
        System.out.println("Total water consumed(in gallons): "+c);
        System.out.println("Annual Tax: Rs "+rate);
    }
}

        
            
            
        