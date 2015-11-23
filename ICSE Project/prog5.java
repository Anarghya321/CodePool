import java.util.*;
public class prog5
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        double y;
        System.out.println("Enter the year");
        y=sc.nextDouble();
        if((y%100==0)&&(y%400!=0))
        {
            System.out.println("It is not a leap year");
        }
        else if(y%4==0)
        {
            System.out.println("It is a leap year");
        }
    }
}
