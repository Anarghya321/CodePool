import java.util.*;
public class prog22
{
    public static void main(String args[])
    {
        int min;
        char t;
        Scanner sc =new Scanner(System.in);
        char a[]= new char[10];
        int x=a.length;
        System.out.println("Enter the characters: ");
        for(int i=0;i<x;i++)
        {
            a[i]=sc.next().charAt(0);
        }
        for(int i=0;i<x;i++)
        {
            min=i;
            for(int j=i+1;j<x;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
                t=a[i];
                a[i]=a[min];
                a[min]=t;
            }
        }
        System.out.println("The numbers arranged in ascending order are: ");
        for(int i=0;i<x;i++)
        {
            System.out.println(a[i]);
        }
    }
}
