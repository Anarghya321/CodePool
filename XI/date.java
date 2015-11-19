import java.util.*;
public class date
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter date in 8-digit");
        String z=sc.next();
        String d=z.substring(0,2);
        String m=z.substring(2,4);
        String y=z.substring(4,8);
        System.out.println("Date:");
        System.out.println(d+"/"+m+"/"+y);
        int a=Integer.parseInt(m);
        String ar[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        for(int i=0;i<ar.length;i++)
        {
            if(a==i+1)
            {
                System.out.println(d+" "+ar[i]+", "+y);
            }
        }
    }
}
