import java.util.*;
public class denomination
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a,d;
        System.out.println("Enter the amount");
        a=sc.nextInt();
        int t=a,ctr=0;
        int amount=a;
        while(t!=0)
        {
            d=t%10;
            t=t/10;
            ctr++;
        }
        int dig[]=new int[ctr];
        int k=0,count=0;
        while(a!=0)
        {
            d=a%10;
            dig[k++]=d;
            a=a/10;
        }
        System.out.println("Output:");
        for(int i=dig.length-1;i>=0;i--)
        {
            if(dig[i]==0)
                System.out.print("Zero ");
            if(dig[i]==1)
                System.out.print("One ");
            if(dig[i]==2)
                System.out.print("Two ");
            if(dig[i]==3)
                System.out.print("Three ");
            if(dig[i]==4)
                System.out.print("Four ");
            if(dig[i]==5)
                System.out.print("Five ");
            if(dig[i]==6)
                System.out.print("Six ");
            if(dig[i]==7)
                System.out.print("Seven ");
            if(dig[i]==8)
                System.out.print("Eight ");
            if(dig[i]==9)
                System.out.print("Nine ");
        }
        System.out.println();
        int notes[]={1000,500,100,50,20,10,5,2,1};
        int totalnotes=0;
        System.out.println("Denominations :");
        for(int j=0;j<notes.length;j++)
        {
            count=amount/notes[j];
            if(count!=0)
            {
                System.out.println(notes[j]+" x "+count+" = "+notes[j]*count);
            }
            totalnotes=totalnotes+count;
            amount=amount%notes[j];
        }
        System.out.println("Total Notes: "+totalnotes);
    }
}

            