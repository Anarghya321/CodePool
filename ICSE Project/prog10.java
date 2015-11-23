import java.util.*;
public class prog10
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        double a,c;
        int n;
        System.out.println("Enter the amount to be invested");
        a=sc.nextDouble();
        System.out.println("Enter 0 for ground floor, 1 for first floor, 2 for second floor and 3 for third floor");
        n=sc.nextInt();
        switch(n)
        {
            case 0:
            c=a-(a*0.18);
            System.out.println("The total discount: 18%");
            System.out.println("Final price: Rs "+c);
            break;
            case 1:
            c=a-(a*0.03);
            System.out.println("The total discount: 03%");
            System.out.println("Final price: Rs "+c);
            break;
            case 2:
            c=a-(a*0.1);
            System.out.println("The total discount: 10%");
            System.out.println("Final price: Rs "+c);
            break;
            case 3:
            c=a-(a*0.175);
            System.out.println("The total discount: 17.5%");
            System.out.println("Final price: Rs "+c);
            break;
            default:
            System.out.println("Wrong choice");
        }
    }
}

            
            