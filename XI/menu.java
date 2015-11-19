import java.util.*;
public class menu
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String item[]={"Starter","Butter Naan","Daal","Fried Rice","Shahi Panner","Salad","Ice Cream","Sweets"};
        double rate[]={80,40,60,80,80,40,40,80};
        String order[]=new String[10];
        double amount[]=new double[10];
        String ans;
        double b,bamt=0;
        int plates[]=new int[10];
        int i,n=0,no,x=0;
        System.out.println("**********************************************");
        System.out.println("THE GREAT INDIAN DHABA - MENU CARD");
        System.out.println("*********************************************");
        System.out.println("Item No.         Item            Rate/plate");
        for(i=0;i<item.length;i++)
        {
            System.out.println((i+1)+".\t\t"+item[i]+"\t\t  Rs "+rate[i]);
        }
        while(true)
        {
            if(x==10)
        break;
        System.out.println("Enter item no.");
        no=sc.nextInt();
        if((no>item.length)||(no<=0))
        {
            System.out.println("Sorry we dont have that item");
            continue;
        }
        order[x]=item[no-1];
        amount[x]=rate[no-1];
        System.out.println("How many plates?");
        no=sc.nextInt();
        plates[x]=no;
        x++;
        if(x>=1)
        {
            System.out.println("Any more item?(Yes/No)");
            ans=sc.next();
            if(ans.equalsIgnoreCase("no"))
            break;
        }
        }
        System.out.println("Cash Memo");
        System.out.println("*****************************************************************");
        System.out.println("Item          No. of plates      Rate           Amount\n");
        System.out.println("***************************************************************");
        for(i=0;i<x;i++)
        {
            b=plates[i]*amount[i];
            bamt=bamt+b;
            System.out.println(order[i]+"\t\t"+plates[i]+"\t\t"+amount[i]+"\t\t"+b);
        }
        System.out.println("Bill Amount Rs. "+bamt);
        System.out.println("*******************");
        bamt=bamt+bamt*.125;
        System.out.println("Total Amount including service charge @ 12.5%=> Rs. "+bamt);
    }
}

            