import java.util.*;
public class prog19
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int flag=0;
        int a[]=new int[10];
        int x=a.length;
        System.out.println("Enter the elements:");
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the no. to be searched");
        int ch=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            if(a[i]==ch)
            {
                flag++;
            }
        }
        if(flag==1)
        {
            System.out.println("Element present");
        }
        else if(flag>1)
        {
            System.out.println("Dublicate elements present");
        }
        else
        {
            System.out.println("Element not present");
        }
    }
}
                