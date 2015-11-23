import java.util.*;
public class prog17
{
    public static void main(String args[])
    {
        int sq;
        Scanner sc =new Scanner(System.in);
        int a[]=new int[15];
        int x=a.length;
        System.out.println("Enter the elements: ");
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("New terms: ");
        for(int i=0;i<x;i++)
        {
            sq=a[i]*a[i];
            System.out.print(sq+" ");
        }
    }
}

        
        