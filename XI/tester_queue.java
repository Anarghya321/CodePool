import java.util.*;
public class tester_queue
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        queue obj=new queue();
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
                obj.insert(e);
                break;
                case 2:
                obj.delete();
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