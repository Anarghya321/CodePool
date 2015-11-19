import java.util.*;
public class tester_stack
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        stack obj=new stack();
        while(true)
        {
            System.out.println("1.Enter element");
            System.out.println("2.Delete element");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                System.out.println("Enter element");
                int e=sc.nextInt();
                obj.push(e);
                break;
                case 2:
                obj.pop();
                break;
                case 3:
                obj.display();
                break;
                case 4:
                System.exit(0);
            }
        }
    }
}