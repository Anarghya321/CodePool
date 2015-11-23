import java.util.*;
public class prog23
{
     public static void main(String args[])
     {
         int flag=0;
         int i,z=0;
         Scanner sc =new Scanner(System.in);
         int a[]= new int[10];
         String b[]=new String[10];
         int x=b.length;
         System.out.println("Enter the name and pincode of the cities:");
         for(i=0;i<x;i++)
         {
             b[i]=sc.next();
             a[i]=sc.nextInt();
         }
         System.out.println("Enter the city name");
         String s=sc.next();
         for(i=0;i<x;i++)
         {
             if(b[i].equalsIgnoreCase(s))
             {
                 flag++;
                 z=i;
             }
         }
         if(flag==1)
         {
             System.out.println("City Name: "+b[z]);
             System.out.println("Pincode: "+a[z]);
         }
         else
         {
             System.out.println("City not found");
         }
        }
    }
    
            
            
         
         
                
            