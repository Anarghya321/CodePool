import java.util.*;
public class prog18
{
    public static void main(String args[])
    {
        int k=0;
        int ch;
        int i;
        Scanner sc =new Scanner(System.in);
        int a[]= new int[5];
        int x=a.length;
        System.out.println("Enter the elements of the array: ");
        for(i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        do
        {
        System.out.println("Enter your choice");
        System.out.println("Enter 1 to insert a no. n");
        System.out.println("Enter 2 to delete a no. n");
        System.out.println("Enter 0 to exit");
        System.out.println("Enter your choice");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter a no. to be inserted");
            int n=sc.nextInt();
            System.out.println("Enter the position after which it will be inserted");
            int p=sc.nextInt();
            for(i=x-1;i>p;i--)
            {
                a[i]=a[i-1];
            }
            a[p]=n;
            System.out.println("New array after inserting element is: ");
            for(i=0;i<x;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
            break;
            case 2:
            System.out.println("Enter the no to be deleted");
            int del=sc.nextInt();
            for(i=0;i<x;i++)
            {
                if(a[i]==del)
                {
                    k=i;
                }
            }
            for(i=k;i<x-1;i++)
            {
                a[i]=a[i+1];
            }
            System.out.println("The new array after deletion is:");
            for(i=0;i<x-1;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
            break;
            case 0:
            System.exit(0);
            break;
            default:
            System.out.println("Wrong choice");
        }
        }while(ch<=2);
}
}

        