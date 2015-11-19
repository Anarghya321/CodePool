import java.util.*;
public class dda_sort
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int m,n;
        System.out.println("Enter the no. of rows");
        m=sc.nextInt();
        System.out.println("Enter the no. of colmns");
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int a[]=new int[m*n];
        int x=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[x]=arr[i][j];
                x++;
            }
        }
        int t=0;
        for(int i=0;i<(m*n)-1;i++)
        {
            for(int j=i+1;j<m*n;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        x=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=a[x];
                x++;
            }
        }
        System.out.println("Sorted Array: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
                    
                
        